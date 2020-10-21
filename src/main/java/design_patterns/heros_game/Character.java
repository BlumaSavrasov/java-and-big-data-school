package design_patterns.heros_game;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Character {
    private int power;
    private int hp;
    abstract void kick(Character c);
    public boolean isAlive(){
        return hp>0;
    }
    public void decreaseHp(int decrease){
        hp-=decrease;
    }
}
