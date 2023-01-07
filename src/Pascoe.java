public class Pascoe extends Person implements toArrive {
    public Pascoe() {
        super("Паскоу",0, 0, Gender.MAN, Status.DEAD);
        //System.out.println("Персонаж " + name + " теперь существует");
    }

    @Override
    public void arrive(Places places2) {
        this.places = places2;
        System.out.println(name+ " прибыл в "+ this.places.getDescription()+this.age);
    }

    public void toFly() {
        this.places = Places.BERGENFIELD;
        System.out.println(name+ " улетел в "+ places.getDescription());
    }

    public void toBe() {
        places = Places.BERGENFIELD;
        //System.out.println(name + " был из " + places.getDescription());
    }
}
