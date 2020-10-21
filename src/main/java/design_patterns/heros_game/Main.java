package design_patterns.heros_game;

public class Main {
    public static void main(String[] args) {
        Character c1= CharacterFactory.createCharacter();
        Character c2= CharacterFactory.createCharacter();
        GameManager game = new GameManager();
        game.fight(c1,c2);

    }
}
