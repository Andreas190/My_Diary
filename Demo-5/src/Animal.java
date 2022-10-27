public class Animal {
    String type;
    String name;
    int age;
    int numberOfLegs;
    boolean isHungry;

    public Animal(String type, String name, int age, int numberOfLegs, boolean isHungry) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.isHungry = isHungry;
    }

    public Animal() {

    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", numberOfLegs=" + numberOfLegs +
                ", isHungry=" + isHungry +
                '}';
    }
}
