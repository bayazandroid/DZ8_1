package game.players;

public class Warrior extends Hero {

    public Warrior(int health, int damage, SuperPower superPower, String name) {
        super(health, damage, name, superPower);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

    }

    @Override
    protected void set(int i) {

    }

}
