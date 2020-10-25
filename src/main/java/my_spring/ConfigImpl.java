package my_spring;

import lombok.Getter;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
@Getter
public class ConfigImpl implements Config {
    private Reflections scanner;
    Map<Class,Class> map;
    public ConfigImpl(String packageToScan,Map<Class,Class> map){
        this.map=map;
        this.scanner = new Reflections(packageToScan);
    }
    @Override
    public <T> Class<? extends T> getImplClass(Class<T> ifc) {
         return map.computeIfAbsent(ifc,aClass -> {
             Set<Class<? extends T>> classes = scanner.getSubTypesOf(ifc);
            if(classes.size()!=1)
            {
                throw new RuntimeException(ifc+"has 0 or more then 1 implementations pls update your config");
            }
            return classes.iterator().next();
         });

    }
}
