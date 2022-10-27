import com.fasterxml.jackson.databind.ObjectMapper;
import model.Animal;
import model.Person;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        Animal animal = new Animal("Tod", "Katt", 7);
        Animal dog = new Animal("Voff", "Hund", 5);
        Animal cat = new Animal("Katt", "Mjau", 29);

        Person person = new Person("Lena", 33);
        Person jyri = new Person("Jyri", 38);
        Person ella = new Person("Ella", 16);

        persons.add(jyri);
        persons.add(ella);

        ObjectMapper mapper = new ObjectMapper();
        Animal elephant;

        try {

            mapper.writeValue(Paths.get("src/main/resources/animal.json").toFile(), animal);
            elephant = mapper.readValue(Paths.get("src/main/resources/animal.json").toFile(), Animal.class);
            System.out.println(elephant.getName());
            System.out.println(elephant.getType());
            System.out.println(elephant.getAge());

            mapper.writeValue(Paths.get("src/main/resources/animal.json").toFile(), dog);
            dog = mapper.readValue(Paths.get("src/main/resources/animal.json").toFile(), Animal.class);
            System.out.println(dog.getName());
            System.out.println(dog.getType());
            System.out.println(dog.getAge());


            Person[] people = mapper.readValue(Paths.get("src/main/resources/persons.json").toFile(), Person[].class);
            List<Person> peopleList = List.of(mapper.readValue(Paths.get("src/main/resources/persons.json").toFile(), Person[].class));
            System.out.println(people.length);
            System.out.println(peopleList.size());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
