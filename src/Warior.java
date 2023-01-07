public abstract class Warior<T extends Weapon> {  // Воин
    private String name;    // Имя воина
    private int healthPoint;    // Здоровье
    private T weapon; // Оружие

    public Warior(String name, int healthPoint, T weapon) {
        this.name = name;
        this.healthPoint = healthPoint;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public T getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setWeapon(T weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return String.format("Имя: %s, здоровье: %d, оружие: %s", name, healthPoint, weapon);
    }
}
