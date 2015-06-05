package abstractClasses;

/**
 * Created by svetlana on 22.04.2015.
 */
public class Student extends Person {

    private String major;

    /**
     * @param n Имя студента
     * @param m Специализация студента
     */
    public Student(String n, String m) {
        //передать строку n конструктору суперкласса в качестве параметра
        super(n);
        major = m;
    }

    @Override
    public String getDescription() {
        return "a student majoring in " + major;
    }
}