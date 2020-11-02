package my_spring.i_robot;

import my_spring.Application;
import my_spring.ApplicationContext;
import my_spring.InjectByType;
import my_spring.ObjectFactory;

import javax.annotation.PostConstruct;
import java.util.HashMap;

public class IRobot {
    @InjectByType
    private Cleaner cleaner;
    @InjectByType
    private Speaker speaker;
    void cleanRoom(){
        speaker.speak("start cleaning");
        cleaner.cleanRoom();
        speaker.speak("finished cleaning");
    }
    @PostConstruct
    public void init(){
        System.out.println(speaker.getClass().getName());
    }
    public static void main(String[] args) {
        ApplicationContext context = Application.run("my_spring", new HashMap<>());
        IRobot robot = context.getObject(IRobot.class);
        robot.cleanRoom();
    }
}

