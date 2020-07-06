package kg.geektech.les8.game.players;

public class Medic extends Hero {

    private int healPoints;

    public Medic(int damage, int health, int healPoints, String name) {
        super(damage, health, SuperAbility.HEAL, name);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getAbility() != SuperAbility.HEAL) {
                heroes[i].setHealth(heroes[i].getHealth() + healPoints);
            }
        }
    }
}
