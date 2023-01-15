public enum Gender {
    MAN("Мужчина"),
    WOMEN("Женщина");
    private String NameGender;

    Gender(String name) {
        this.NameGender = name;
    }

    public String getNameGender() {
        return NameGender;
    }
}
