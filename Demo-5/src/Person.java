public class Person {

    String name;
    int age;
    boolean isHungry;

    public Person(String namn, int age, boolean isHungry) {
        this.name = name;
        this.age = age;
        this.isHungry = isHungry;

    }

    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHungry=" + isHungry +
                '}';
    }
}
