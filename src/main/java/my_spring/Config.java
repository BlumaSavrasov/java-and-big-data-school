package my_spring;

import org.reflections.Reflections;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> clazz);
    Reflections getScanner();
}
