import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team<T extends Warior> implements Iterable<T> {  // Команда
    List<T> warriors = new ArrayList<>(); // Команда воинов
    private Comandor comandor;  // Командир

    public Team(Comandor comandor) {
        this.comandor = comandor;
    }

    public Comandor getComandor() {
        return comandor;
    }

    public void addWarrior(T newWarrior) {
        warriors.add(newWarrior);
    }

    @Override
    public Iterator<T> iterator() {
        return warriors.iterator();
    }

    public int getAllDamage() { // Суммарное поражение от всех участников
        int sumDamage = 0;
        for (T item : warriors) {
            sumDamage += item.getWeapon().damage();
        }
        return sumDamage;
    }

    public int getAllHealthPoint() { // Суммарное здоровье
        int sumHealth = 0;
        for (T item : this) {
            sumHealth += item.getHealthPoint();
        }
        return sumHealth;
    }

    public int getMaxRange() { // Максимальная дальность лука
        int maxRange = 0;
        for (T item : warriors) {
            Weapon weapon = item.getWeapon();
            if (weapon instanceof Bow) {    // Если оружие - это лук
                Bow bow = (Bow) weapon;
                if (maxRange < bow.range()) {
                    maxRange = bow.range();
                }
            }
        }
        return maxRange;
    }

    public int getAllProtection() { // Суммарная защита от всех участников
        int sumProtection = 0;
        for (T item : warriors) {
            sumProtection += item.getShield().protection();
        }
        return sumProtection;
    }
}