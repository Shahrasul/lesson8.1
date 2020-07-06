package kg.geektech.les8.game.players;

import java.util.Random;

public class Thor  extends Hero{


    public Thor(int damage, int health, String name) {
        super(damage, health, SuperAbility.THUNDERBOLT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        if (random.nextInt(3) == 2){
            boss.setStun(true);
            System.out.println("Босс оглушен");
        }

    }
}
