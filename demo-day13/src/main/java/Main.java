import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import static java.util.Calendar.MONDAY;
import static java.util.Calendar.TUESDAY;

public class Main {
    public static void main(String[] args) {

        Map<Integer, String> wordsMap = new HashMap<>();
        wordsMap.put(1, "Ord");
        wordsMap.put(32, "Mer ord");
        wordsMap.put(3, "Ännu mer ord");

        Map<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("One", "Ett");
        linkedHashMap.put("Seven", "Sju");
        linkedHashMap.put("Two", "Två");

        Set<Map.Entry<String, String>> entriesLinked = linkedHashMap.entrySet();
        for (Map.Entry<String, String> entry : entriesLinked) {
            System.out.println(entry.getValue());
        }

        Set<Map.Entry<Integer, String>> entries = wordsMap.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getValue());
        }


        for (Planet planet : Planet.values()) {
            System.out.println(planet.getName());
        }

        System.out.println(Planet.NEPTUNE.getEarthForYears());

    }

        static void printInfoAboutWeekDay (WeekDay weekDay){
             switch (weekDay) {
                case MONDAY:
                    System.out.println("Måndag är en vardag");
                    break;
                 case TUESDAY:
                     System.out.println("Tisdag är en vardag");
                     break;
                 case WEDNESDAY:
                     System.out.println("Onsdag är en vardag");
                     break;
                 case THURSDAY:
                     System.out.println("Torsdag är en vardag");
                     break;
                 case FRIDAY:
                     System.out.println("Fredag är en vardag");
                     break;
                 case SATURDAY:
                     System.out.println("Lördag är en helgdag");
                     break;
                 case SUNDAY:
                     System.out.println("Söndag är en helgdag");
        }
    }
}
