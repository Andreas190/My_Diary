import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Methods {
    private ArrayList<Entries> entries;
    Scanner scanner = new Scanner(System.in);
    Methods methods;

    public void Diary() {
        Methods methods = new Methods();
    }


    private LocalDate readLocalDate() {
        return LocalDate.ofYearDay();
    }

    public void Database() {
        entries = new ArrayList<>();
    }

    public void addEntry(String title, String userEntry, LocalDate date) {
        entries.add(new Entries(title, userEntry, date));
    }

    public void addEntry(LocalDate date, String text) {
        LocalDate dateTime = readLocalDate();
        System.out.println("Skriv in titel");
        String title = scanner.nextLine();
        System.out.println("");
        methods.addEntry(dateTime, text);

/*    public ArrayList<Entries> showEntries(LocalDate date) {
        ArrayList<Entries> found = new ArrayList<>();
        for (Entries entry : entries) {
            if ((entry.getDate().equals(date))) { // filtered by date only
                found.add(entry);
            }
        }
        return found;
    }*/
    }

    private  LocalDate readLocalDate() {
    }
}
