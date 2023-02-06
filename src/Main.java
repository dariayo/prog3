import enums.*;
import exceptions.*;
import persons.*;

public class Main {
    public static void main(String[] args) {
        Louis louis = new Louis();
        louis.arrive(Places.CAFE);
        louis.arrive(Places.CABINET);
        try {
            System.out.println(louis.eat(Item.SANDWICH));
            louis.eat(Item.COCACOLA);
        } catch (IllegalFoodException e) {
            System.out.println(e.getMessage());
        } catch (UnrealHealthException check) {
            System.out.println(check.getMessage());
        }
        louis.toThrew(Item.TRASH, Places.TABLE);
        louis.toDrum(Item.TABLE);

        Pascoe pascoe = new Pascoe();
        Pascoe pascoeInMind = new Pascoe();
        louis.toThink(Item.CASE, pascoeInMind);
        try {
            pascoe.arrive(Places.BERGENFIELD);
            pascoe.toFly();

            Funeralguy funeralguy = new Funeralguy();
            funeralguy.arrive(Places.MORGUE);

            Pathologist pathologist = new Pathologist();
            System.out.println(louis.sayAbout("Патологоанатом"));
            System.out.println(pathologist.sayAbout("Луис"));
            pathologist.toSuggest(pascoe);

            Ridgewick ridgewick = new Ridgewick();
            ridgewick.toOpen(pascoe);

            Father father = new Father();
            father.getLocation(Places.NEWARK);
            father.arrive(Places.BERGENFIELD);
            father.sayAbout("Паскоу");
        } catch (IllegalLocationException e) {
            System.out.println(e.getMessage());
        }
        
        Guy guy = new Guy();
        try {
            guy.toDie();
            guy.bePump();
            guy.giveGuarantee(3);
            guy.toSave();
            guy.arrive(Places.GRANDFOLLS);
            guy.eat(Item.BEER);
        } catch (IllegalFoodException e) {
            System.out.println(e.getMessage());
        } catch (UnrealHealthException check) {
            System.out.println(check.getMessage());
        }
        
    }
}
