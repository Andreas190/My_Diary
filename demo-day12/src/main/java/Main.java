import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Person lena = new Person("Lena", 34);
        //Person jyri = new Person("Jyri", 43);

        ObjectMapper mapper = new ObjectMapper();


/*        List<Person> people = new ArrayList<>();
        Person lena = mapper.readValue(Paths.get("src/main/resources/lena.json").toFile(), Person.class);
        people.add(lena);
        System.out.println(Person.NUMBER_OF_PEOPLE);
        Person jyr1 = mapper.readValue(Paths.get("src/main/resources/jyri.json").toFile(), Person.class);
        people.add(jyr1);
        System.out.println(Person.NUMBER_OF_PEOPLE);*/

/*        for (Person person : people) {
            System.out.println(person.getName());
        }*/
        List<Person> people = new ArrayList<>();
        Person ella = new Person("Ella", 5);
        Person nora = new Person("Nora", 12);

        List<Person> tempFromJSON = (List.of(mapper.readValue(Paths.get("src/main/resources/people.json").toFile(), Person[].class)));
        people.addAll(tempFromJSON);
        //people.add(ella);
        //people.add(nora);



        mapper.writeValue(Paths.get("src/main/resources/people.json").toFile(), people);

       // mapper.writeValue(Paths.get("src/main/resources/lena.json").toFile(), lena);
       // mapper.writeValue(Paths.get("src/main/resources/jyri.json").toFile(), jyri);

    }
}
