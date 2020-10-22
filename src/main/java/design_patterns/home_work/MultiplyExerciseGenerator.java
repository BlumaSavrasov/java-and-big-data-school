package design_patterns.home_work;

import design_patterns.heros_game.GenerateExerciseHelper;

public class MultiplyExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        return GenerateExerciseHelper.generateExercise(Operation.MULTIPLY,100);
    }
}
