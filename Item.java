public enum Item {
    COCACOLA("кока-кола"),
    SANDWICH("сэндвич с тунцом"),
    MEAL("обед"),
    TRASH("мусор"),
    CONNECTION("связь");
    private String title;
    public Places getLocation(Places places){
        return places;
    }
    Item(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

}
