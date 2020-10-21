package design_patterns.heros_game;

public class King extends Character {
    private Weapon sword=new Sword();
    public King() {
        super(RandomUtil.generateIntInRange(5,15), RandomUtil.generateIntInRange(5,15));
    }

    @Override
    void kick(Character c) {
        sword.kick(this,c);
    }
}
