import java.util.ArrayList;

public class For {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Lena");
        names.add("Jyri");
        names.add("Ella");
        names.add("Alva");
        names.add("Nova");
        names.add("Theo");

        int nameSize = names.size();

        for (int i = 0; i < nameSize; i++) {
            System.out.println(names.get(i));
        }
    }
}
