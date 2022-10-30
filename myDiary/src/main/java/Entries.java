import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.awt.SystemColor.text;

public class Entries {
    private String title;
    private String userEntry;
    private LocalDate date;


    public Entries() {
    }

    public Entries(String title, String userEntry, LocalDate date) {
        this.title = title;
        this.userEntry = userEntry;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserEntry() {
        return userEntry;
    }

    public void setUserEntry(String userEntry) {
        this.userEntry = userEntry;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

/*    @Override
    public String toString() {
        return "Entries{" +
                "title='" + title + '\'' +
                ", userEntry='" + userEntry + '\'' +
                ", date=" + date +
                '}';
    }*/
    @Override
    public String toString() {
        return date.format(Diary.dateTimeFormatter) + " " + text;


    }
}
