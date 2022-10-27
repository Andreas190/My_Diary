public class Main {
    public static void main(String[] args) {

        String firstNameAndreas = "Andreas";
        String lastNameRenni = "Renni";
        int ageAndreas = 30;

        String firstNameTobbe = "Tobbe";
        String lastNameTobiasson = "Tobiasson";
        int ageTobbe = 32;

        printGreeting();
        printLine();
        printContactCard(firstNameAndreas, lastNameRenni, ageAndreas);
        printContactCard(firstNameTobbe, lastNameTobiasson, ageTobbe);


    }
    static void printGreeting() {
        System.out.println("Välkommen till din kontaktbok");
    }

    static void printContactCard(String firstName , String lastName, int age){
        printFirstName(firstName);
        printLastName(lastName);
        System.out.println("Det här är åldern: " + age);
        printLine();

    }

    static void printLine() {
        System.out.println("----------------------");

    }

    static String printLineNotVoid(){
        return "---------return metod------------";

    }

    static void printFirstName(String firstName){
        System.out.println("Det här är förnamnet: " + firstName);

    }

    static void printLastName(String lastName){
        System.out.println("Det här är efternamnet: " + lastName);

    }

    static int getNumberOne(){
        int numberOne = 1;
        return numberOne;
    }
}
