package enums;

public enum Status {
    DEAD("Умер"),
    NOTBAD("В порядке"),
    SHOCKED("Удивлен"),
    OPEN("Вскрыт"),
    SEARCH("В поиске"),
    UNBROKEN("Не разложен"),
    BROKEN("Разложен"),
    PUMP("Накачен препаратом"),
    CALM("Спокоен");
    private String title;
    protected Status status;

    Status(String title) {
        this.title = title;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
