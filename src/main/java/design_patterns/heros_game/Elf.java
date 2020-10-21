package design_patterns.heros_game;

public class Elf extends Character {
    @Override
    protected int getInitialPower() {
        return 10;
    }

    @Override
    protected int getInitialHp() {
        return 10;
    }

    @Override
    void kick(Character c) {
        if(c.getPower()<this.getPower()) {
            c.die();
        }
        else c.decreasePower(1);
    }
}
