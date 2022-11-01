package hW3_2.exceptions;

public class TelephoneException extends RuntimeException{
    public TelephoneException() {
        System.out.println("TelephoneException: Telephone number entered incorrectly");
    }
}
