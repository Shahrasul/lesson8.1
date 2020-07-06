package kg.geektech.les8.game.players;

public abstract class Hero extends GameEntity implements HavingSuperAbility {

    private SuperAbility ability;
    private String name;

    public Hero(int damage, int health, SuperAbility ability, String name) {
        super(damage, health);
        this.ability = ability;
        this.name = name;
    }

    public SuperAbility getAbility() {
        return ability;
    }

    public void setAbility(SuperAbility ability) {
        this.ability = ability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
