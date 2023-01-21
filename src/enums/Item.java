package enums;

public enum Item {
    COCACOLA("кока-кола"),
    SANDWICH("сэндвич с тунцом"),
    TABLE("стол"),
    CASE("дело"),
    TRASH("мусор");
    private String title;
    public Places places;

    public Places getLocation(Places places) {
        return this.places = places;
    }

    Item(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
