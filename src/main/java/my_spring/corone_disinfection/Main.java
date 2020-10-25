package my_spring.corone_disinfection;

import my_spring.Application;
import my_spring.ApplicationContext;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
       // CoronaDisinfection disinfection= ObjectFactory.getInstance().createObject(CoronaDisinfection.class);
        ApplicationContext context = Application.run("my_spring", new HashMap<>());
        CoronaDisinfection disinfection = context.getObject(CoronaDisinfection.class);
        disinfection.start(new Room());
    }
}
