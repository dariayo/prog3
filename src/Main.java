public class Main {
    public static void main(String[] args) {

        Louis louis = new Louis();
        louis.arrive(Places.CAFE);
        louis.arrive(Places.CABINET);
        System.out.println(louis.eat(Item.SANDWICH));

        louis.eat(Item.COCACOLA);
        louis.toThrew(Item.TRASH, Places.TABLE);
        louis.status = Status.NOTBAD;
        louis.toDrum(Item.TABLE);

        Pascoe pascoe = new Pascoe();
        Pascoe pascoeInMind = new Pascoe();
        louis.toThink(Item.CASE, pascoeInMind);
        pascoe.toFly();

        Funeralguy funeralguy = new Funeralguy();
        funeralguy.arrive(Places.MORGUE);

        Pathologist pathologist = new Pathologist();
        System.out.println(louis.SayAbout("Патологоанатом"));
        System.out.println(pathologist.SayAbout("Луис"));
        pathologist.toSuggest(pascoe);

        Ridgewick ridgewick = new Ridgewick();
        ridgewick.toOpen(pascoe);

        Father father = new Father();
        father.getLocation(Places.NEWARK);
        father.arrive(Places.BERGENFIELD);
    }
}

