package design_patterns.heros_game;

public class Knight extends Character {
    private Weapon sword=new Sword();

    @Override
    protected int getInitialPower() {
        return RandomUtil.generateIntInRange(2,12);
    }

    @Override
    protected int getInitialHp() {
        return RandomUtil.generateIntInRange(2,12);
    }

    @Override
    void kick(Character c) {
        sword.kick(this,c);
    }
}
