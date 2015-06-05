package equals;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

/**
 * Created by svetlana on 22.04.2015.
 */
public class Employee {

    private String name;
    private double salary;
    private Date hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        hireDay = calendar.getTime();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public void raiseSalary(double byPersent) {
        double raise = salary * byPersent / 100;
        salary += raise;
    }

    @Override
    public boolean equals(Object otherObject) {
        //проверяем объекты на идентичность
        if (this == otherObject) return true;

        //если явный параметр - null, возвращаем false
        if (otherObject == null) return false;

        //если классы не совпадают, они не равнозначны
        if (getClass() != otherObject.getClass()) return false;

        //теперь известно, что otherObject - непустой объект типа Employee
        Employee other = (Employee) otherObject;

        //проверяем, содержат ли поля одинаковые значения
        return Objects.equals(name, other.name) && salary == other.salary &&
                Objects.equals(hireDay, other.hireDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, hireDay);
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name=" + name +
                ",salary=" + salary + ",hireDay=" + hireDay + "]";
    }

}
