package streams;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue(Paths.get("src/main/java/streams/people.json").toFile(), Person[].class);


    }
}
