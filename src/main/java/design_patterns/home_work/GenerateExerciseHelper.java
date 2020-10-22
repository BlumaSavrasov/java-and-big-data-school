package design_patterns.home_work;


import design_patterns.heros_game.RandomUtil;


public class GenerateExerciseHelper {
    public static Exercise generateExercise(Operation operation, int limit){
        int a= RandomUtil.generateIntInRange(0, limit);
        int b=RandomUtil.generateIntInRange(0, limit);
        return Exercise.builder()
                .a(a)
                .b(b)
                .operand(operation)
                .build();

    }
}
