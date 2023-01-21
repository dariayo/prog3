package Enum;

public enum Gender {
    MAN("Мужчина"),
    WOMEN("Женщина");
    private String NameGender;

    Gender(String name) {
        this.NameGender = name;
    }
}
