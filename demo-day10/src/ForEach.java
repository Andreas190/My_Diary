import model.Animal;
import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        Animal lion = new Animal("Leo", "Lejon", 7);
        Animal dog = new Animal("Rio", "Hund", 4);
        Animal cat = new Animal("Tod", "Katt", 5);

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(dog);
        animals.add(cat);

        for (Animal animal : animals) {
            System.out.println(animal.getName() + " = " + animal.getType());
        }
    }
}
