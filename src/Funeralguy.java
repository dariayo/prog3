public class Funeralguy extends Person implements toArrive {
    public Funeralguy() {
        super("Парень из похоронной", 100, 35, Gender.MAN, Status.CALM);
    }

    @Override
    public void arrive(Places places2) {
        this.places = getLocation(places2);
        //System.out.println(name + " прибыл в " + this.places.getDescription());
    }
}
