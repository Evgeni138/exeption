package hW3_2.exceptions;

public class BirthDateException extends RuntimeException{
    public BirthDateException() {
        System.out.println("BirthDateException: Birth date entered incorrectly");
    }
}
