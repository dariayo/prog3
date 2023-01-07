public class Pascoe extends Person implements toArrive {
    public Pascoe() {
        super("Паскоу",0, 0, Gender.MAN, Status.DEAD);
    }

    @Override
    public void arrive(Places places2) {
        this.places = places2;
    }

    public void toFly() {
        this.places = Places.BERGENFIELD;
    }
}
