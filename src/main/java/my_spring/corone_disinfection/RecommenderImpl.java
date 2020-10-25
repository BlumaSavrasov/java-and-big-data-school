package my_spring.corone_disinfection;

import my_spring.InjectProperty;
import my_spring.Singleton;

@Singleton
@Deprecated
public class RecommenderImpl implements Recommender {
    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println("to protect from covid-19, drink "+alcohol);
    }
}
