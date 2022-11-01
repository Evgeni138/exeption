package hW3_2;

import java.util.Scanner;

public class InputData {
    public String[] enterData() {
        Scanner iScanner = new Scanner(System.in);
        while (true){
            System.out.println("Input your last name, first name, patronymic, date of birth(format dd.MM.yyyy), " +
                    "telephone number, sex(f or m), enter with space");
            String data = iScanner.nextLine();
            String[] arrayData = data.split(" ");
            if (arrayData.length == 6) {
                return arrayData;
            } else if (arrayData.length < 6){
                System.out.println("Exception: you have not entered all the data, please try again");
            } else System.out.println("Exception: you entered more data, please try again");
        }

    }
}
// qwea qwes qwed 12.12.1234 2132432 f
