public class Pascoe extends Person implements toArrive {
    public Pascoe(String name,int health,int age,Gender gender,Status status) {
        super (name,health,age,gender,status);
        //System.out.println("Персонаж " + name + " теперь существует");
    }
    @Override
    public void arrive(Places places1,Places places2){
        places1=getLocation(places2);
        //System.out.println(name+ " прибыл в "+ places1.getDescription());
    }
    public void toGrow() {
        int age1 = age + 18;
        places = Places.LUDLOW;
        //System.out.println(name + " вырос в " + places.getDescription());
        //System.out.println("Возраст " + name + " изменился с " + age + " до " + age1);
    }
    public void toFly(){
        this.places = Places.BERGENFIELD;
        //System.out.println(name+ " улетел в "+ places.getDescription());
    }

    public void toBury(Animal animal) {
        if (animal==Animal.CAT){
            animal.getLocation(Places.CEMETRY);
            this.places = Places.CEMETRY;
            //System.out.println(name+ " похоронил " + animal.getTitle()+ " на " + places.getDescription());
        }
        else {
            animal.getLocation(Places.CEMETRY);
            this.places = Places.CEMETRY;
            //System.out.println(name+ " похоронил " + animal.getTitle()+ " на " + places.getDescription());
        }
    }

    public void toBe(){
        places = Places.BERGENFIELD;
        System.out.println(name + " был из " + places.getDescription());
    }



}
