package HW2;

import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
// значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
// запросить у пользователя ввод данных.
public class Task1 {
    public static void main(String[] args) {
        Task1 task = new Task1();
        System.out.println(task.inputNumber());
    }

    public double inputNumber() {
        Scanner iScanner = new Scanner(System.in);
        boolean flag = true;
        double number = 0;
        while (flag) {
            System.out.print("Input number: ");
            String str = iScanner.nextLine();
            try {
                number = Double.parseDouble(str);
                return number;
            }
            catch (NumberFormatException e) {
                System.out.println("Input correct number");
            }
        }
        return number;
    }
}
