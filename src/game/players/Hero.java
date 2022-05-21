package game.players;

public abstract class Hero extends GameEntity implements HavingSuperPower {

    private SuperPower superPower;

    public Hero(int health, int damage, String name, SuperPower superPower) {
        super(health, damage, name);
        this.superPower = superPower;
    }

    public SuperPower getSuperPower() {
        return superPower;
    }

    public void setSuperPower(SuperPower superPower) {
        this.superPower = superPower;
    }

    public abstract void applySuperPower(Boss boss, Hero[] heroes);

    protected abstract void set(int i);
}
