package hW3_2.checks;

import hW3_2.exceptions.BirthDateException;

public class CheckBirthDate {
    public boolean checkDate(String data) {
        boolean flag = true;
        String[] arrayDate = data.split("\\.");

        if (Integer.parseInt(arrayDate[0]) < 0 ||
                Integer.parseInt(arrayDate[0]) > 31 || Integer.parseInt(arrayDate[1]) < 0 ||
                Integer.parseInt(arrayDate[1]) > 12 || Integer.parseInt(arrayDate[2]) < 0 ||
                Integer.parseInt(arrayDate[2]) > 2022) {
            throw new BirthDateException();
        } else {
            if (Integer.parseInt(arrayDate[2]) % 4 == 0) {
                if (Integer.parseInt(arrayDate[1]) == 1 ||
                        Integer.parseInt(arrayDate[1]) == 3 ||
                        Integer.parseInt(arrayDate[1]) == 5 ||
                        Integer.parseInt(arrayDate[1]) == 7 ||
                        Integer.parseInt(arrayDate[1]) == 9 ||
                        Integer.parseInt(arrayDate[1]) == 10 ||
                        Integer.parseInt(arrayDate[1]) == 12) {
                    if (Integer.parseInt(arrayDate[0]) < 32) {
                        flag = false;
                    }
                } else if (Integer.parseInt(arrayDate[1]) == 2) {
                    if (Integer.parseInt(arrayDate[0]) < 30) {
                        flag = false;
                    }
                } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                        Integer.parseInt(arrayDate[1]) == 6 ||
                        Integer.parseInt(arrayDate[1]) == 8 ||
                        Integer.parseInt(arrayDate[1]) == 11) {
                    if (Integer.parseInt(arrayDate[0]) < 31) {
                        flag = false;
                    }
                }
            } else {
                if (Integer.parseInt(arrayDate[1]) == 1 ||
                        Integer.parseInt(arrayDate[1]) == 3 ||
                        Integer.parseInt(arrayDate[1]) == 5 ||
                        Integer.parseInt(arrayDate[1]) == 7 ||
                        Integer.parseInt(arrayDate[1]) == 9 ||
                        Integer.parseInt(arrayDate[1]) == 10 ||
                        Integer.parseInt(arrayDate[1]) == 12) {
                    if (Integer.parseInt(arrayDate[0]) < 32) {
                        flag = false;
                    }
                } else if (Integer.parseInt(arrayDate[1]) == 2) {
                    if (Integer.parseInt(arrayDate[0]) < 29) {
                        flag = false;
                    }
                } else if (Integer.parseInt(arrayDate[1]) == 4 ||
                        Integer.parseInt(arrayDate[1]) == 6 ||
                        Integer.parseInt(arrayDate[1]) == 8 ||
                        Integer.parseInt(arrayDate[1]) == 11) {
                    if (Integer.parseInt(arrayDate[0]) < 31) {
                        flag = false;
                    }
                }

            }
        } return flag;
    }
}
