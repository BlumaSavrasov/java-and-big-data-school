package design_patterns.home_work;

public class MinusExerciseGenerator implements ExerciseGenerator {
    @Override
    public Exercise generate() {
        return GenerateExerciseHelper.generateExercise(Operation.MINUS,100);
    }
}
