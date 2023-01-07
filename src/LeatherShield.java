public class LeatherShield extends Shield { //Кожаный щит
    @Override
    public int protection() {   // Степень защиты щита
        return 5;
    }

    @Override
    public String toString() {
        return "Кожаный щит - " + super.toString();
    }
}
