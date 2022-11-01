package hW3_2.checks;

public class CheckTelNumber {
    public boolean checkTel(String number) {
        if (number.matches("[0-9]+")) {
            return true;
        } else return false;
    }
}
