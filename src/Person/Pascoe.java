package Person;

import Enum.*;
import Interfaces.*;

public class Pascoe extends Person implements ToArrive {
    public Pascoe() {
        super("Паскоу", 0, 0, Gender.MAN, Status.DEAD);
        System.out.println("Персонаж " + name + " теперь существует");
    }

    @Override
    public void arrive(Places places) {
        this.places = places;
        System.out.println(name + " прибыл в " + this.places.getDescription());
    }

    public void toFly() {
        setLocation(Places.BERGENFIELD);
        System.out.println(name + " улетел в " + places.getDescription());
    }

}
