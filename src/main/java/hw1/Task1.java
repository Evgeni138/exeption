package hw1;

import java.util.Scanner;

//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{};
        addItem(arr, 7);
        String str = "";
        printString(str);
        div();

    }

    public static void addItem(int[] arr, int num) {
        if (arr.length == 0) System.out.println("Exeption: Index 0 out of bounds for length 0");
        else {
            arr[0] = num;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void printString(String str) {
        if (str.equals("")) System.out.println("Exception: string can not be ''!");
        else System.out.println(str);
    }

    public static void div() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Input numberA");
        int a = iScanner.nextInt();
        System.out.println("Input numberB");
        int b = iScanner.nextInt();
        if (b == 0) System.out.println("Exception: / by zero");
        else System.out.println(a / b);
    }


}



