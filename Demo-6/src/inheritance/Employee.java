package inheritance;

public class Employee extends Person{
    private int id;

    public Employee(String name, String hairColour, boolean isHappy, int age, int id) {
        super(name, hairColour, isHappy, age);
        this.id = id;
    }
}

