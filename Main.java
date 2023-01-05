public class Main {
    public static void main(String[] args) {
        Louis louis = new Louis("Луис",30,30,Gender.MAN,Status.CALM);
        louis.arrive(Places.CABINET,Places.CAFE);
        louis.arrive(Places.CAFE,Places.CABINET);
        louis.eat(Item.SANDWICH);
        Pascoe pascoe = new Pascoe("Паскоу",0,0,Gender.MAN,Status.CALM);
        louis.toFind(Status.SEARCH);
        if (louis.status==Status.SEARCH){
            pascoe.toGrow();
            pascoe.toBury(Animal.CAT);
            pascoe.toBury(Animal.DOG);
            pascoe.toDie();
        }
        pascoe.toFly();
        pascoe.arrive(Places.CAFE,Places.CEMETRY);
        louis.toThrew(Item.TRASH,Places.TABLE);
    }
}
