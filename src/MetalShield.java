public class MetalShield extends Shield {   // Металлический щит
    @Override
    public int protection() {   // Степень защиты щита
        return 20;
    }

    @Override
    public String toString() {
        return "Металлический щит - " + super.toString();
    }
}
