package design_patterns.home_work;

import design_patterns.heros_game.GenerateExerciseHelper;

public class PlusExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        return GenerateExerciseHelper.generateExercise(Operation.PLUS,100);
    }
}


