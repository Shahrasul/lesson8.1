package kg.geektech.les8.game.players;

public class Golem extends Hero{
    public Golem(int damage, int health, String name) {
        super(damage, health, SuperAbility.TANK, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (!boss.isStun()) {
            for (Hero hero : heroes) {
                hero.setHealth(hero.getHealth() + (boss.getDamage() / 5));
                setHealth(getHealth() - (boss.getDamage() / 5));
            }
        }
    }
}
