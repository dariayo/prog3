public enum Status {
    DEAD("Умер"),
    NOTBAD("в порядке"),
    OPEN("вскрытый"),
    SEARCH("в поиске"),
    CALM("Спокойный");
    private String title;

    Status(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus(Status status) {
        return status;
    }
}
