public class Archer extends Warior<Bow> {    // Лучник

    public Archer(String name, int healthPoint, Bow bow) {
        super(name, healthPoint, bow);
    }

    @Override
    public String toString() {
        return "Лучник - " + super.toString();
    }
}
