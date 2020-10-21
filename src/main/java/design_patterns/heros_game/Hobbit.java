package design_patterns.heros_game;

public class Hobbit extends Character {
    Hobbit(){
        super(0,3);
    }
    @Override
    void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit crying:`/");

    }
}
