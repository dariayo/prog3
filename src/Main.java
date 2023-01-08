public class Main {
    public static void main(String[] args) {
        Louis louis = new Louis();
        Pascoe pascoe = new Pascoe();
        Pascoe pascoeInMind = new Pascoe();
        louis.toThink(Item.CASE,pascoeInMind); // Так возраст у Паскоу меняться не будет
    }
}
