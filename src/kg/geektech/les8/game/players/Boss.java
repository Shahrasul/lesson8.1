package kg.geektech.les8.game.players;

public class Boss extends GameEntity {
    boolean isStun = false;

    public boolean isStun() {
        return isStun;
    }

    public void setStun(boolean stun) {
        isStun = stun;
    }

    public Boss(int damage, int health) {
        super(damage, health);
    }

}
