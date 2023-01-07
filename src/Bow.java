public abstract class Bow implements Weapon {   // Лук
    public abstract int range();    // дальность поражения из лука

    @Override
    public String toString() {
        return String.format("Радиус поражения %d, урон %d", range(), damage());
    }
}
