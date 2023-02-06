package exceptions;

public class IllegalFoodException extends RuntimeException{
    public IllegalFoodException(String message){
        super(message);
    }
}