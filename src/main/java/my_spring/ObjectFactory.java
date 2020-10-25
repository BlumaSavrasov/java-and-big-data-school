package my_spring;

import com.sun.jdi.InterfaceType;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

@AllArgsConstructor
public class ObjectFactory {

   private static List<ObjectConfigurator> configurators=new ArrayList<>();
    private static ObjectFactory ourInstance= new ObjectFactory();
    private Config config= new ConfigImpl();
    public static ObjectFactory getInstance(){
        return ourInstance;
    }


    @SneakyThrows
    private ObjectFactory(){
        Reflections scanner = new Reflections("my_spring");
        Set<Class<? extends ObjectConfigurator>> classes = scanner.getSubTypesOf(ObjectConfigurator.class);
        for (Class<? extends ObjectConfigurator> aClass : classes) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());

        }

    }

    @SneakyThrows
    public <T> T createObject(Class<T> clazz){
        clazz = resolveImpl(clazz);
        T t = create(clazz);
        configure(t);
       initInvoke(t);
        return t;
    }
    @SneakyThrows


    private <T> void initInvoke(T t)  {
        Set<Method> methods = ReflectionUtils.getAllMethods(t.getClass(), method -> method.getName().startsWith("init"));
        for (Method method : methods) {
            method.invoke(t);
        }
    }

    private <T> void configure(T t) {
        configurators.forEach(configurator->configurator.configure(t));
    }


    private <T> T create(Class<T> clazz) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        T t= clazz.getDeclaredConstructor().newInstance();
        return t;
    }

    private <T> Class<T> resolveImpl(Class<T> clazz) {
        if(clazz.isInterface())
            clazz = config.getImplClass(clazz);
        return clazz;
    }

}
