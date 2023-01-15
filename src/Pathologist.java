public class Pathologist extends Person {
    public Pathologist() {
        super("Патологоанатом",100,30,Gender.MAN,Status.CALM);
    }
    public Places toSuggest(Pascoe pascoe){
        return pascoe.getLocation(Places.DISCO);
    }

}
