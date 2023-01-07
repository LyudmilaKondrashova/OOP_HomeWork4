public class Comandor extends Warior<Weapon, LeatherShield> {  // Командир

    public Comandor(String name, int healthPoint, Weapon weapon, LeatherShield leatherShield) {
        super(name, healthPoint, weapon, leatherShield);
    }


    @Override
    public String toString() {
        return "Командир - " + super.toString();
    }
}
