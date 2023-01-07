import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Louis louis = new Louis();
        louis.arrive(Places.CAFE);
        louis.arrive(Places.CABINET);
        System.out.println(louis.eat(Item.SANDWICH));
        final Pascoe pascoe = new Pascoe();
        //louis.toThink(Item.CASE,pascoe);
        louis.eat(Item.COCACOLA);
        louis.toThrew(Item.TRASH,Places.TABLE);
        louis.status=Status.NOTBAD;
        louis.toDrum(Item.TABLE);
        pascoe.toFly();
        Funeralguy funeralguy = new Funeralguy();
        funeralguy.arrive(Places.MORGUE);
        Ridgewick ridgewick = new Ridgewick();
        ridgewick.toOpen(pascoe);
        Father father = new Father();
        father.getLocation(Places.NEWARK);
        father.arrive(Places.BERGENFIELD);
        Pathologist pathologist = new Pathologist();
        pathologist.toSuggest(pascoe);
        System.out.println(pascoe.places);
        louis.toThink(Item.CASE,pascoe);
    }
}
