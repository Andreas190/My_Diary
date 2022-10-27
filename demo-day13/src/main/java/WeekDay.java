public enum WeekDay {
    MONDAY("Måndag"),
    TUESDAY("Tisdag"),
    WEDNESDAY("Onsdag"),
    THURSDAY("Torsdag"),
    FRIDAY("Fredag"),
    SATURDAY("Lördag"),
    SUNDAY("Söndag");

    private final String value;

    WeekDay(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
