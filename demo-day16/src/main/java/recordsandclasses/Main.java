package recordsandclasses;

public class Main {
    public static void main(String[] args) {
        PersonClass lenaClass = new PersonClass("Lena", 33, "Dr. Strange");
        PersonRecord lenaRecord = new PersonRecord("Lena", 33, "Dr. Strange");

        System.out.println(lenaClass);
        System.out.println(lenaRecord);

        System.out.println(lenaClass.hashCode());
        System.out.println(lenaRecord.hashCode());
    }
}
