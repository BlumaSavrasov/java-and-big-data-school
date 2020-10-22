package design_patterns.home_work;

import design_patterns.heros_game.RandomUtil;

import java.util.ArrayList;
import java.util.List;

public class Examinator{
    private static List<ExerciseGenerator>generators=List.of(new PlusExerciseGenerator(),new MultiplyExerciseGenerator(),new MinusExerciseGenerator());
    public List<Exercise> getExercises(int amount){
        List<Exercise>  exercises =new  ArrayList<>();
        for(int i=0;i<amount;i++){
            Exercise exercise = generators.get(RandomUtil.generateIntInRange(0, generators.size())).generate();
            exercises.add(exercise);
        }
       return exercises;
    }
}
