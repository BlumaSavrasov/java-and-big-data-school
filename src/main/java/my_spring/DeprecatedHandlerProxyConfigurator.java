package my_spring;

import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class DeprecatedHandlerProxyConfigurator implements ProxyConfigurator {
    @Override
    public Object replaceWithProxyIfNeeded(Object t, Class implClass) {
        boolean methodAnnotated = Arrays.stream(t.getClass().getMethods()).anyMatch(method -> method.isAnnotationPresent(Deprecated.class));
        if(implClass.isAnnotationPresent(Deprecated.class)||methodAnnotated) {
            if(implClass.getInterfaces().length==0){
                return Enhancer.create(implClass, (net.sf.cglib.proxy.InvocationHandler) (proxy, method, args) -> {
                    return getInvocationHandlerLogic(t, implClass, method, args);
                });
            }
            return Proxy.newProxyInstance(implClass.getClassLoader(), implClass.getInterfaces(), (proxy, method, args) -> {
                return getInvocationHandlerLogic(t, implClass, method, args);
            });
        }
        return t;
    }

    private Object getInvocationHandlerLogic(Object t, Class implClass, Method method, Object[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        Method classMethod = implClass.getMethod(method.getName(), method.getParameterTypes());
        if (implClass.isAnnotationPresent(Deprecated.class) || classMethod.isAnnotationPresent(Deprecated.class)) {
            System.out.println("******** you using deprecated method *******");
        }
        return method.invoke(t, args);
    }

}
