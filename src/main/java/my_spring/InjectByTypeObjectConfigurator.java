package my_spring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

public class InjectByTypeObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t,ApplicationContext context) {
       Set<Field> fields = ReflectionUtils.getAllFields(t.getClass(),field -> field.isAnnotationPresent(InjectByType.class));
        for (Field field : fields) {
                Class<?> type = field.getType();
                field.setAccessible(true);
                Object object=context.getObject(type);
                field.set(t,object);
        }
    }
}
