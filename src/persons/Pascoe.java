package persons;

import enums.*;
import interfaces.*;

public class Pascoe extends Person implements ToArrive {
    public Pascoe() {
        super("Паскоу", 0, 0, Gender.MAN, Status.DEAD);
        System.out.println("Персонаж " + name + " теперь существует");
    }

    @Override
    public void arrive(Places places) throws IllegalLocationException {
        this.places = places;
        if (places==Places.BUCKET || places==Places.TABLE){
            throw new IllegalLocationException(" невозможная локация для человека");
        }
        System.out.println(name + " прибыл в " + this.places.getDescription());
    }

    public void toFly() {
        setLocation(Places.BERGENFIELD);
        System.out.println(name + " улетел в " + places.getDescription());
    }

}
