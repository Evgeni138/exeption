package hW3_2.exceptions;

public class SexException extends RuntimeException {
    public SexException () {
        System.out.println("SexException: Sex entered incorrectly");
    }
}