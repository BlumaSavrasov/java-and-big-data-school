package my_spring;

import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Set;

public class InjectRandomIntObjectConfigurator implements ObjectConfigurator {
    @Override
    @SneakyThrows
    public void configure(Object t) {
        Set<Field> fields = ReflectionUtils.getAllFields(t.getClass(),field -> field.isAnnotationPresent(InjectRandomInt.class));
        for (Field field : fields) {
                InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
                int min = annotation.min();
                int max = annotation.max();
                field.setAccessible(true);
                field.setInt(t, RandomUtil.getRandomInRange(min, max));
        }
    }
}
