package kg.geektech.les8.game.players;

import java.util.Random;

public class Magic extends Hero {

    public Magic(int damage, int health, String name) {
        super(damage, health, SuperAbility.BOOST, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbility() != SuperAbility.HEAL) {
                heroes[i].setDamage(heroes[i].getDamage() + randomNumber);
            }
        }
    }
}

