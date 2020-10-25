package my_spring;

public interface ProxyConfigurator {
    Object replaceWithProxyIfNeeded(Object t,Class implClass);
}
