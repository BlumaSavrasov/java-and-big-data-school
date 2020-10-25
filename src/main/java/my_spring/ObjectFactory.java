package my_spring;

import com.sun.jdi.InterfaceType;
import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.SneakyThrows;
import org.reflections.ReflectionUtils;
import org.reflections.Reflections;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.*;

@AllArgsConstructor
public class ObjectFactory {
    @Setter
    private final ApplicationContext context;
    private List<ObjectConfigurator> configurators=new ArrayList<>();
    private List<ProxyConfigurator> proxyConfigurators=new ArrayList<>();


    @SneakyThrows
    public ObjectFactory(ApplicationContext context){
       //context.config= new ConfigImpl("my_spring",new HashMap<>());
        this.context=context;
        for (Class<? extends ObjectConfigurator> aClass : context.getConfig().getScanner().getSubTypesOf(ObjectConfigurator.class)) {
            configurators.add(aClass.getDeclaredConstructor().newInstance());
        }
        for (Class<? extends ProxyConfigurator> aClass : context.getConfig().getScanner().getSubTypesOf(ProxyConfigurator.class)) {
            proxyConfigurators.add(aClass.getDeclaredConstructor().newInstance());
        }

    }

    @SneakyThrows
    public <T> T createObject(Class<T> implClass){
        T t = create(implClass);
        configure(t,context);
        initInvoke(t);
        t = wrapWithProxyIfNeeded(implClass, t);
        return t;
    }

    private <T> T wrapWithProxyIfNeeded(Class<T> implClass, T t) {
        for (ProxyConfigurator proxyConfigurator : proxyConfigurators) {
            t = (T) proxyConfigurator.replaceWithProxyIfNeeded(t, implClass);
        }
        return t;
    }

    @SneakyThrows
    private <T> void initInvoke(T t)  {
        Set<Method> methods = ReflectionUtils.getAllMethods(t.getClass(), method -> method.isAnnotationPresent(PostConstruct.class));
        for (Method method : methods) {
            method.invoke(t);
        }
    }

    private <T> void configure(T t,ApplicationContext context) {
        configurators.forEach(configurator->configurator.configure(t,context));
    }


    private <T> T create(Class<T> clazz) throws InstantiationException, IllegalAccessException, java.lang.reflect.InvocationTargetException, NoSuchMethodException {
        T t= clazz.getDeclaredConstructor().newInstance();
        return t;
    }
}
