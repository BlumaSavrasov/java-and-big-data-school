package design_patterns.heros_game;

import java.util.Map;

public class CharacterFactory {
    private static Map<Integer,Character> characters=Map.of(1,new Hobbit(),
            2,new Elf(),
            3,new King(),
            4,new Knight());
    public static Character createCharacter(){
        int characterKey = RandomUtil.generateIntInRange(1, 4);
        return characters.get(characterKey);
    }
}
