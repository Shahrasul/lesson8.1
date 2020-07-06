package kg.geektech.les8.game.players;

public class Hunter extends Hero {

    public Hunter(int damage, int health, String name) {
        super(damage, health, SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        if (!boss.isStun()){
        for (Hero hero:heroes) {
                hero.setHealth(hero.getHealth() + (boss.getDamage() / 3));
                boss.setHealth(boss.getHealth() - (boss.getDamage() / 3));
            }

        }
    }
}
