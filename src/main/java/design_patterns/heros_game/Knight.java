package design_patterns.heros_game;

public class Knight extends Character {
    private Weapon sword=new Sword();
    public Knight() {
        super(RandomUtil.generateIntInRange(2,12), RandomUtil.generateIntInRange(2,12));
    }

    @Override
    void kick(Character c) {
        sword.kick(this,c);
    }
}
