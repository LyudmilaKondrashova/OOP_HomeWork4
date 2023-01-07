public class Main {
    public static void main(String[] args) {
        Comandor comandor = new Comandor("Vasya", 250, new LongBow(), new LeatherShield());
        Team<Archer> archers = new Team<>(comandor);
        archers.addWarrior(new Archer("Petr", 180, new LongBow(), new WoodenShield()));
        archers.addWarrior(new Archer("Semen", 210, new LongBow(), new WoodenShield()));
        System.out.println(comandor);
        archers.forEach(item -> System.out.println(item));
        System.out.println("Суммарный урон - " + archers.getAllDamage() +
                ", суммарное здоровье - " + archers.getAllHealthPoint() +
                ", максимальная зона поражения - " + archers.getMaxRange() +
                ", суммарная защита - " + archers.getAllProtection());
        System.out.println("-----------------------------------------------------");

        Comandor comandor1 = new Comandor("SuperVasya", 530, new LongBow(), new LeatherShield());
        Team<Barbarian> barbarians = new Team<>(comandor1);
        barbarians.addWarrior(new Barbarian("Serg", 170, new Sekira(), new MetalShield()));
        System.out.println(comandor1);
        for (Barbarian item : barbarians) {
            System.out.println(item);
        }
        System.out.println("Суммарный урон - " + barbarians.getAllDamage() +
                ", суммарное здоровье - " + barbarians.getAllHealthPoint() +
                ", максимальная зона поражения - " + barbarians.getMaxRange() +
                ", суммарная защита - " + barbarians.getAllProtection());
        System.out.println("-----------------------------------------------------");

        Comandor comandor2 = new Comandor("Dima", 290,new LongBow(), new LeatherShield());
        Team<Warior> wariors = new Team<>(comandor2);
        wariors.addWarrior(new Archer("Lev", 145, new LongBow(), new WoodenShield()));
        wariors.addWarrior(new Barbarian("Alex", 325, new Sekira(), new MetalShield()));
        System.out.println(comandor2);
        wariors.forEach(item -> System.out.println(item));
        System.out.println("Суммарный урон - " + wariors.getAllDamage() +
                ", суммарное здоровье - " + wariors.getAllHealthPoint() +
                ", максимальная зона поражения - " + wariors.getMaxRange() +
                ", суммарная защита - " + wariors.getAllProtection());
        System.out.println("-----------------------------------------------------");
    }
}