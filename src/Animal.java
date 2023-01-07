public enum Animal  {
    CAT("кошку"),
    DOG("cобаку");
    private String title;
    protected Places places;
    public Places getLocation(Places places){
        return places;
    }
    Animal(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }

}
