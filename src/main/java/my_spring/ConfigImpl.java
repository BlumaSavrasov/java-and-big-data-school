package my_spring;

import java.util.HashMap;
import java.util.Map;

public class ConfigImpl implements Config {
    Map<Class,Class> map=new HashMap<>();
    public ConfigImpl(){
        map.put(Speaker.class,ConsoleSpeaker.class);
        map.put(Cleaner.class,CleanerImpl.class);
    }
    @Override
    public <T> Class<T> getImplClass(Class<T> clazz) {
        return map.get(clazz);
    }
}
