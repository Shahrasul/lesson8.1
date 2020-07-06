package kg.geektech.les8.game.players;

public class Witcher extends Hero{
    public Witcher(int damage, int health,  String name) {
        super(damage, health, SuperAbility.REVIVAL ,name);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {

    }
}
