package design_patterns.heros_game;


import design_patterns.home_work.Exercise;
import design_patterns.home_work.Operation;

public class GenerateExerciseHelper {
    public static Exercise generateExercise(Operation operation, int limit){
        int a= RandomUtil.generateIntInRange(0, limit);
        int b=RandomUtil.generateIntInRange(0, limit);
        return new Exercise(a,b,operation);

    }
}
