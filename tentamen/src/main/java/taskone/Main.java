package taskone;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name = "";

        while (name.isEmpty()) {
            System.out.print("Skriv in ditt namn ");
            name = userInput.nextLine().trim();

            if (name.isEmpty() || name.length() < 2) {
                System.out.println("Namnet måste innehålla minst två bokstäver");
                name = "";
            }
        }

        String firstLetter = name.substring(0,1);
        System.out.println();
        System.out.println("Hej " + name);
        System.out.println("Ditt namn börjar på ; " + firstLetter);
    }
}