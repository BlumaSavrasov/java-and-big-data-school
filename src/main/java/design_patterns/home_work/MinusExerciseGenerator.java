package design_patterns.home_work;

import design_patterns.heros_game.GenerateExerciseHelper;

public class MinusExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        return GenerateExerciseHelper.generateExercise(Operation.MINUS,100);
    }
}
