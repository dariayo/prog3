public enum Gender {
    MAN("Мужчина"),
    WOMEN("Женщина"),
    CORPSE("Труп"),
    ANIMAL("Животное");
    private String NameGender;

    Gender(String name) {
        this.NameGender = name;
    }

    public String getNameGender() {
        return NameGender;
    }
}