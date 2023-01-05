public class Louis extends Person implements toArrive {
    public Louis(String name, int health, int age, Gender gender, Status status) {
        super(name, health, age, gender, status);
        name = "Луис";
        System.out.println("Персонаж " + name + " теперь существует");
    }
    public boolean toFind(Status status){
        return this.status==status.SEARCH;
    }
    @Override
    public void arrive(Places places1, Places places2) {
        places1 = getLocation(places2);
        //System.out.println(name + " прибыл в " + places1.getDescription());
    }

    public void eat(Item food) {
        if (health < 50) {
            //System.out.println(name + " съел " + food.getTitle());
            health = health + 10;
        } else {
            //System.out.println("Я не голодный");
        }
    }
    public void toThrew(Item item, Places places) {
        if (item == Item.TRASH & places == Places.TABLE) {
            item.getLocation(Places.BUCKET);
            this.places = Places.BUCKET;
            //System.out.println(name + item.getTitle() + " выбросил в " + this.places.getDescription());
        }
    }
}
