package my_spring;


import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class InjectPropertyObjectConfigurator implements ObjectConfigurator {


    private  Map<String, String> propertiesMap;

    @SneakyThrows
    public InjectPropertyObjectConfigurator() {
        String path = ClassLoader.getSystemClassLoader().getResource("application.properties").getPath();
        Stream<String> lines = new BufferedReader(new FileReader(path)).lines();
        propertiesMap = lines.map(line -> line.split("=")).collect(toMap(arr -> arr[0], arr -> arr[1]));
    }

    @Override
    @SneakyThrows
    public void configure(Object t,ApplicationContext context) {
        Set<Field> fields = ReflectionUtils.getAllFields(t.getClass(), field -> field.isAnnotationPresent(InjectProperty.class));
        String value;
        for (Field field : fields) {
            InjectProperty annotation = field.getAnnotation(InjectProperty.class);
            value = annotation.value().isEmpty() ? propertiesMap.get(field.getName()) : propertiesMap.get(annotation.value());
            field.setAccessible(true);
            field.set(t,value);
        }
    }
}
