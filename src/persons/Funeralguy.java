package persons;

import enums.*;
import exceptions.IllegalLocationException;
import interfaces.*;

public class Funeralguy extends Person implements ToArrive {
    public Funeralguy() {
        super("Парень из похоронной", 100, 35, Gender.MAN, Status.CALM);
    }

    @Override
    public void arrive(Places places) throws IllegalLocationException {
        this.places = getLocation(places);
        if (places==Places.BUCKET || places==Places.TABLE){
            throw new IllegalLocationException(" невозможная локация для человека");
        }
        System.out.println(name + " прибыл в " + this.places.getDescription());
    }
}
