public class Louis extends Person implements toArrive {
    public Louis() {
        super("Луис",45, 30, Gender.MAN, Status.CALM);
        System.out.println("Персонаж " + name + " теперь существует");
    }

    public void toThink(Item item,Pascoe pascoe){
        if (item == Item.CASE){ //думает
            pascoe.age = (int) (pascoe.age + Math.random()*50);
            pascoe.getLocation(Places.LUDLOW);
            //System.out.println(pascoe.name + " вырос в " + pascoe.places.getDescription());
            //System.out.println("Возраст " + pascoe.name + " изменился с " + pascoe.age + " до " + age1);

            Animal.CAT.getLocation(Places.CEMETRY);
            //System.out.println(pascoe.name+ " похоронил " + Animal.CAT.getTitle()+ " на " + places.getDescription());
            Animal.DOG.getLocation(Places.CEMETRY);
            //System.out.println(pascoe.name+ " похоронил " + Animal.DOG.getTitle()+ " на " + places.getDescription());

            if (pascoe.health == 0) {
                pascoe.status = status.DEAD;
                //System.out.println(pascoe.name + " умер");
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
        //System.out.println(name + " прибыл в " + this.places.getDescription());
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
            //this.places = Places.BUCKET;
            System.out.println(name +" "+ item.getTitle() + " выбросил в " + item.places.getDescription());
        }
    }
    public String toDrum(Item item){
        return name+" побарабанил по " + item.getTitle();
    }
}
