public abstract class Shield {  // Щит
    public abstract int protection();    // степень защиты щита

    @Override
    public String toString() {
        return String.format("Степень защиты %d", protection());
    }
}
