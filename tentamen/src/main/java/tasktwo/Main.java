package tasktwo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String name = "";

            switch (name) {
                case "0":
                name.isEmpty();
                System.out.print("Skriv in ditt namn ");
                name = userInput.nextLine().trim();
                break;


                case "1":
                    name.isEmpty();
                    boolean b = name.length() < 2;
                    System.out.println("Namnet måste innehålla minst två bokstäver");
                    name = "";
                    break;

                case "2":
                    String firstLetter = name.substring(0, 1);
                    System.out.println();
                    System.out.println("Hej " + name);
                    System.out.println("Ditt namn börjar på ;" + firstLetter);
                    break;
                default:
                    System.out.print("Skriv in ditt namn ");
                    name = userInput.nextLine().trim();
                    break;

            }
        }

    }


