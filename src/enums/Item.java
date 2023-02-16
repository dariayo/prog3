package enums;

public enum Item {
    TABLE("стол","имеет аккустику",120),
    CASE("дело","сделано из бумаги",15),
    BUCKET("ведро","красного цвета",50),
    TRASH("мусор","можно утилизировать",25);
    private String title;
    public Places places;
    public String property;
    public int size;

    public Places changeLocation(Places places) {
        return this.places = places;
    }

    Item(String title, String property,int size) {
        this.title = title;
        this.property= property;
        this.size=size;
    }

    public String getTitle() {
        return title;
    }

}
