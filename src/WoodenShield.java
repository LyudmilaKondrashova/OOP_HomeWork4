public class WoodenShield extends Shield {  // Деревянный щит
    @Override
    public int protection() {   // Степень защиты щита
        return 10;
    }

    @Override
    public String toString() {
        return "Деревянный щит - " + super.toString();
    }
}
