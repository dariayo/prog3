import enums.*;
import exceptions.*;
import persons.*;

public class Main {
    public static void main(String[] args) {
        Louis louis = new Louis();
        louis.arrive(Places.CAFE);
        louis.arrive(Places.CABINET);
        try {
            louis.eat(Food.SANDWICH);
            louis.eat(Food.COCACOLA);
        } catch (UnrealHealthException check) {
            System.out.println(check.getMessage());
        }
        louis.toThrew(Item.TRASH);
        louis.toDrum(Item.TABLE);

        Pascoe pascoe = new Pascoe();
        Pascoe pascoeInMind = new Pascoe();
        louis.toThink(Item.CASE, pascoeInMind);
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
        
        Guy guy = new Guy();
        Guy.Friends friends = new Guy.Friends();
        guy.toDie();
        friends.pump(guy);
        friends.giveGuarantee(3);
        guy.toSave();
        guy.arrive(Places.NORTHLUDLOW);
        try {
            guy.eat(Food.BEER);
        } catch (IllegalFoodException e) {
            System.out.println(e.getMessage());
        } catch (UnrealHealthException check) {
            System.out.println(check.getMessage());
        }
        
    }
}
