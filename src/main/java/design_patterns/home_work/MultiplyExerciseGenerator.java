package design_patterns.home_work;

public class MultiplyExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        return GenerateExerciseHelper.generateExercise(Operation.MULTIPLY,100);
    }
}
