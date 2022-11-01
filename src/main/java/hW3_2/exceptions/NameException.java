package hW3_2.exceptions;

public class NameException extends RuntimeException{
    public NameException() {
        System.out.println("NameException: Name entered incorrectly");
    }
}
