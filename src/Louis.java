public class Louis extends Person implements toArrive {
    public Louis() {
        super("Луис",45, 30, Gender.MAN, Status.CALM);
        System.out.println("Персонаж " + name + " теперь существует");
    }

    public void toThink(Item item,Pascoe pascoe){
        if (item == Item.CASE){ //думает
            pascoe.age = (int) (pascoe.age + Math.random()*50);
            pascoe.getLocation(Places.LUDLOW);

            Animal.CAT.getLocation(Places.CEMETRY);
            Animal.DOG.getLocation(Places.CEMETRY);

            if (pascoe.health == 0) {
                pascoe.status = status.DEAD;
                pascoe.name = "Dead " + pascoe.getName();
            }
        }
        else if(item == null || pascoe!=pascoe){
            //System.out.println("Я ни о чем не думаю");
        }
    }
    @Override
    public void arrive(Places places2) {
        this.places = getLocation(places2);
    }

    public String eat(Item food) {
        if (health < 50) {
            health = health + 10;
            return name + " съел " + food.getTitle();
        }
            return "Я не голодный";
        }

    public void toThrew(Item item, Places places) {
        if (item == Item.TRASH & places == Places.TABLE) {
            item.getLocation(Places.BUCKET);
            //System.out.println(name +" "+ item.getTitle() + " выбросил в " + item.places.getDescription());
        }
    }
    public String toDrum(Item item){
        return name+" побарабанил по " + item.getTitle();
    }
}
