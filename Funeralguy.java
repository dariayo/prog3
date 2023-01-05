public class Funeralguy extends Person implements toArrive{
    public Funeralguy(String name, int health, int age, Gender gender, Status status) {
        super(name, health, age, gender, status);
    }
    @Override
    public void arrive(Places places1,Places places2){
        places1=getLocation(places2);
        System.out.println(name+ " прибыл в "+ places1.getDescription());
    }
}
