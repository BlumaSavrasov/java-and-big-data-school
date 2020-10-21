package design_patterns.heros_game;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    @Override
    void kick(Character c) {
        if(c.getPower()<this.getPower()) {
            c.setHp(0);
        }
        else c.decreaseHp(1);
    }
}
