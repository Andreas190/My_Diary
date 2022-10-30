
public class Entry {
    private String date;
    private String title;
    private String text;

    public Entry() {
    }
    public Entry(String date, String title, String text) {
        this.date = date;
        this.title = title;
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "date='" + date + '\'' +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
