public class Comandor extends Warior<Weapon> {  // Командир

    public Comandor(String name, int healthPoint, Weapon weapon) {
        super(name, healthPoint, weapon);
    }


    @Override
    public String toString() {
        return "Командир - " + super.toString();
    }
}
