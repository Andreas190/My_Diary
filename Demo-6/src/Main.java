import model.Person;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Häst");
        //animal.type = "Häst";
        animal.setAge(4);
        System.out.println(animal.getAge());

        //animal.makeSound();

        Person person = new Person();
        person.name = "Lena";
        //person.sayHello();

/*        Counter counter = new Counter();
        System.out.println(Counter.COUNTER);
        Counter counter1 = new Counter();
        System.out.println(Counter.COUNTER);*/
    }
}
