package HW2;

import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
// показаться сообщение, что пустые строки вводить нельзя.
public class Task4 {
    public static void main(String[] args) {
        Task4 task = new Task4();
        System.out.println(task.inputString());
    }

    public String inputString() {
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.print("Input string: ");
            String str = iScanner.nextLine();
            if (str.isEmpty()) {
                System.out.println("Exeption: don`t input empty string");
            }
            else return str;
        }
    }
}
