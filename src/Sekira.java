public class Sekira extends Axe { // Секира
    @Override
    public int damage() {
        return 20;
    }

    @Override
    public String toString() {
        return String.format("Секира - урон %d", damage());
    }
}
