package abstractClasses;

/**
 * Created by svetlana on 22.04.2015.
 */
public abstract class Person {

    public abstract String getDescription();

    private String name;

    public Person(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

}