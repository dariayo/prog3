package Person;

import Enum.*;
import Interfaces.*;

public class Funeralguy extends Person implements ToArrive {
    public Funeralguy() {
        super("Парень из похоронной", 100, 35, Gender.MAN, Status.CALM);
    }

    @Override
    public void arrive(Places places) {
        this.places = getLocation(places);
        System.out.println(name + " прибыл в " + this.places.getDescription());
    }
}
