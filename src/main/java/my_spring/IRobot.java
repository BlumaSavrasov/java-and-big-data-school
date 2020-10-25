package my_spring;

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

    public void init(){
        System.out.println(speaker.getClass().getName());
    }
    public static void main(String[] args) {
        IRobot robot = ObjectFactory.getInstance().createObject(IRobot.class);
        robot.cleanRoom();
    }
}

