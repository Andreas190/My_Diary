import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Lena", "Jyri", "Ella", "Alva", "Nova", "Theo"};
        System.out.println(Arrays.toString(names));

        int lengthOfNames = names.length;
        int indexOfLastName = lengthOfNames - 1;

        System.out.println(names[indexOfLastName]);

        int[] numbers = new int[6];
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println("Plats 1:" + numbers [0]);
        System.out.println("Plats 2:" + numbers [1]);

        ArrayList<String> familyNames = new ArrayList<>();
        familyNames.add("Lena");
        System.out.println(familyNames);


        String alva = names[3];
        System.out.println(alva);


/*        int [] numbers = {1, 2, 3};
        System.out.println(Arrays.toString(numbers));*/


    }
}
