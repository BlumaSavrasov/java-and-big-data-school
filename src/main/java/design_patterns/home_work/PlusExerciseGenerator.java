package design_patterns.home_work;

public class PlusExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        return GenerateExerciseHelper.generateExercise(Operation.PLUS,100);
    }
}


