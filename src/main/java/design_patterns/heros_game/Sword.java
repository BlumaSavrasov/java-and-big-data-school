package design_patterns.heros_game;

public class Sword implements Weapon {
    @Override
    public void kick(Character c1,Character c2) {
        int decrease=RandomUtil.generateIntInRange(0,c1.getPower());
        c1.decreaseHp(decrease);
    }
}
