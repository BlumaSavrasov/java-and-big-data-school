package design_patterns.heros_game;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    public Character(){
        hp=getInitialHp();
        power=getInitialPower();
    }

    protected abstract int getInitialPower();

    protected abstract int getInitialHp();

    abstract void kick(Character c);
    public boolean isAlive(){
        return hp>0;
    }
    public void decreasePower(int decrease){
        power-=decrease;
    }

    protected  void die(){
        hp=0;
    }

    public  void decreaseHp(int decrease){
        hp-=decrease;
    }
}
