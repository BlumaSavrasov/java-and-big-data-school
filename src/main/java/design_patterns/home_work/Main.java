package design_patterns.home_work;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        Exercise exercise=new Exercise(10,20,Operation.PLUS);
        System.out.println(exercise);
        Examinator examinator=new Examinator();
        List<Exercise> exercises = examinator.getExercises(10);
        System.out.println(exercises);
    }
}
