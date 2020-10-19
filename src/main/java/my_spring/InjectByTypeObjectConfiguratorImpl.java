package my_spring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

public class InjectByTypeObjectConfiguratorImpl implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
       Set<Field> fields = ReflectionUtils.getAllFields(t.getClass());
        for (Field field : fields) {
            if(field.isAnnotationPresent(InjectByType.class)){
                Class<?> type = field.getType();
                field.set(t,type.getDeclaredConstructor().newInstance());
            }

        }
    }
}
