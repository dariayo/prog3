package enums;

public enum Animal {
    CAT("кошка"),
    DOG("cобака");
    private String title;
    protected Places places;

    public Places getLocation(Places places) {
        return places;
    }

    Animal(String title) {
        this.title = title;
    }


}
