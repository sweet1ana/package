package inheritance;

/**
 * Created by svetlana on 22.04.2015.
 */
public class Manager extends Employee {

    private double bonus;
    /**
     * @param n     Имя сотрудника
     * @param s     Зарплата
     * @param year  Год приема на работу
     * @param month Месяц приема на работу
     * @param day   День приема на работу
     */
    public Manager(String n, double s, int year, int month, int day) {
        super(n, s, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }
}
