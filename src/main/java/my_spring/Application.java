package my_spring;

import java.util.Map;

public class Application {
    public static  ApplicationContext run(String packageToScan, Map<Class,Class> ifc2implClass){
        ConfigImpl config = new ConfigImpl(packageToScan, ifc2implClass);
        ApplicationContext context = new ApplicationContext(config);
        ObjectFactory objectFactory = new ObjectFactory(context);
        //todo - init all singletons that arent lazy
        context.setFactory(objectFactory);
        return context;
    }
}
