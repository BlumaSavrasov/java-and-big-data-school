package design_patterns.heros_game;

public class GameManager {
    public void fight(Character c1,Character c2){
        System.out.println(c1+" VS "+c2);
        System.out.println("Let the fight begin and may the best man winn!");
        while(c1.isAlive()&&c2.isAlive()){
            c1.kick(c2);
            c2.kick(c2);
            System.out.println(c1);
            System.out.println(c2);
        }
        System.out.println("And the winner is:");
        if(c1.isAlive()){
            System.out.println(c1);
        }
        else{
            System.out.println(c2);
        }
    }
}
