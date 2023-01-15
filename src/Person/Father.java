package Person;

import Enum.*;
import Interfaces.*;

public class Father extends Person implements ToArrive, Sayable {
    public Father() {
        super("Отец", 100, 60, Gender.MAN, Status.NOTBAD);
    }

    @Override
    public String sayAbout(String personName) {
        if (personName.equals("Паскоу")) {
            return "Я обо всем договорился";
        } else {
            return "Даже не знаю, что и сказать";
        }
    }

    @Override
    public void arrive(Places places) {
        this.setLocation(places);
        System.out.println(name + " прибыл в " + places.getDescription());
    }
}
