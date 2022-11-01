package hW3_2.checks;

public class CheckSex {
    public boolean checkSex(String data) {
        if (data.equals("f") || data.equals("m")) {
            return true;
        } else return false;
    }
}
