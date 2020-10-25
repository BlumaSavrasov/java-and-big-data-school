package my_spring.corone_disinfection;

import my_spring.InjectByType;
import my_spring.ObjectFactory;

public class consoleAnnouncer implements Announcer {
    @InjectByType
    private Recommender recommender ;

    @Override
    public void announce(String message) {
        System.out.println(message);
        recommender.recommend();
    }
}
