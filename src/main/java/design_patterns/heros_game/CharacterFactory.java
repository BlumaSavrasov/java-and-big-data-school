package design_patterns.heros_game;

import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.lang.reflect.Modifier;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterFactory {
    private  List<Class<? extends Character>> characters;
    public CharacterFactory(){
        Reflections scanner = new Reflections("design_patterns.heros_game");
        characters = scanner.getSubTypesOf(Character.class)
                 .stream().filter(type -> !Modifier.isAbstract(type.getModifiers()))
                .collect(Collectors.toList());
    }
    @SneakyThrows
    public  Character createCharacter(){
        int characterIndex = RandomUtil.generateIntInRange(0,characters.size());
        return characters.get(characterIndex).getDeclaredConstructor().newInstance();
    }
}
