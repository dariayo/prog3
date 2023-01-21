package persons;

import enums.*;
import interfaces.*;

public class Pathologist extends Person implements Sayable {
    public Pathologist() {
        super("Патологоанатом", 100, 30, Gender.MAN, Status.CALM);
    }

    public Places toSuggest(Pascoe pascoe) {
        return pascoe.getLocation(Places.DISCO);
    }

    @Override
    public String sayAbout(String personName) {
        if (personName.equals("Луис") && personName.hashCode()=="Луис".hashCode()) {
            return "У нас его нет";
        } else {
            return "Даже не знаю, что и сказать";
        }
    }

}
