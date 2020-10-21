package design_patterns.heros_game;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character c1= characterFactory.createCharacter();
        Character c2= characterFactory.createCharacter();
        GameManager game = new GameManager();
        game.fight(c1,c2);

    }
}
