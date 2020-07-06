package kg.geektech.les8.game.players;

public abstract class GameEntity {
    private int damage;
    private int health;

    public GameEntity(int damage, int health) {
        this.damage = damage;
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }
}