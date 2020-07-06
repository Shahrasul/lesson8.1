package kg.geektech.les8.game.players;

import java.util.Random;

public class Warrior extends Hero {

    public Warrior(int damage, int health, String name) {
        super(damage, health, SuperAbility.CRITICAL_DAMAGE, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (getHealth() > 0){
            Random random = new Random();
            int randomNum = random.nextInt(2) + 2;
            boss.setHealth(boss.getHealth() - (getDamage() * randomNum));
            System.out.println("Воин нанес критический урон: " + getDamage() * randomNum);
        }

    }
}
