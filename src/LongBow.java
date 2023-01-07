public class LongBow extends Bow {  // Длинный лук
    @Override
    public int range() {    // дальность поражения из лука
        return 100;
    }

    @Override
    public int damage() {   //Наносимый урон
        return 10;
    }

    @Override
    public String toString() {
        return "Длинный лук - " + super.toString();
    }
}
