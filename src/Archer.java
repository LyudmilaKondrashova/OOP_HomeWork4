public class Archer extends Warior<Bow, WoodenShield> {    // Лучник

    public Archer(String name, int healthPoint, Bow bow, WoodenShield woodenShield) {
        super(name, healthPoint, bow, woodenShield);
    }

    @Override
    public String toString() {
        return "Лучник - " + super.toString();
    }
}
