package design_patterns.heros_game;

public class Hobbit extends Character {
    @Override
    protected int getInitialPower() {
        return 0;
    }

    @Override
    protected int getInitialHp() {
        return 3;
    }

    @Override
    void kick(Character c) {
        toCry();
    }

    private void toCry() {
        System.out.println("Hobbit crying:`/");

    }
}
