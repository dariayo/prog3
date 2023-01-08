public class Main {
    public static void main(String[] args) {
        Louis louis = new Louis();
        Pascoe pascoe = new Pascoe();
        Pascoe deadpascoe = new Pascoe();
        louis.toThink(Item.CASE,deadpascoe); // Так возраст у Паскоу меняться не будет
    }
}
