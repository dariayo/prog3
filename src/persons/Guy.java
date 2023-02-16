package persons;

import enums.*;
import exceptions.IllegalLocationException;
import interfaces.*;

public class Guy extends Person implements ToArrive {
    public Guy() {
        super("Парень", 0, 30, Gender.MAN, Status.CALM);
        System.out.println("Персонаж " + name + " теперь существует");
    }

    public void toSave() {
        int chance = (int) (Math.random() * 100);
        if (this.health == 0 && chance > 50) {
            ToSave medicine = new ToSave() { // анонимный класс
                public void save() {
                    String medicine = "препарат";
                    status.setStatus(Status.UNBROKEN);
                    health+=15;
                    System.out.println(medicine + " сработал");
                }
            };
            medicine.save();
        } else if (this.health == 0 && chance <= 50) {
            status.setStatus(Status.BROKEN);
        }
    }

    @Override
    public void arrive(Places places) throws IllegalLocationException {
        this.places = getLocation(places);
        if (places == Places.BUCKET || places == Places.TABLE) {
            throw new IllegalLocationException(" невозможная локация для человека");
        }
        System.out.println(name + " прибыл в " + this.places.getDescription());
    }

    public static class Friends { // вложенный статический класс
        public void pump(Person person) {
            String friends = "друзья";
            person.caloriesEaten += 10;
            System.out.println(friends + " закачали препарат");
        }
    }
    public class Guarantee { //вложенный нестатический класс
            private String guarantee = "гарантия";

            public void give() {
                System.out.println("дать " + guarantee);
            }

            public void notGive() {
                System.out.println("нельзя дать " + guarantee);
            }
        }

    public void giveGuarantee(int period) {
        Guarantee guarantee = new Guarantee();
        if (period < 1) {
            guarantee.give();
        } else {
            guarantee.notGive();
        }
    }
    
}
