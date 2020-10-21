package design_patterns.heros_game;

import java.util.Random;

public class RandomUtil {
     private static Random random = new Random();

    public static int generateIntInRange(int min, int max) {
        return random.ints(min, max).findAny().getAsInt();
    }
}
