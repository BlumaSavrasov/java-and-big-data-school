package design_patterns.heros_game;

public class King extends Character {
    private Weapon sword=new Sword();

    @Override
    protected int getInitialPower() {
        return RandomUtil.generateIntInRange(5,15);
    }

    @Override
    protected int getInitialHp() {
        return RandomUtil.generateIntInRange(5,15);
    }

    @Override
    void kick(Character c) {
        sword.kick(this,c);
    }
}
