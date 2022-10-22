package hw1;
/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь
может увидеть - RuntimeException, т.е. ваше
* **/


public class Task3 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = new int[]{1, 2, 3, 4, 5, 0};
        int[] result = divArr(arr1, arr2);
        for (int i = 0; i < result.length; i++) {
            System.out.printf(" " + result[1]);
        }
    }

    public static int[] divArr(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            int[] resultArr = new int[arr1.length];
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0) throw new RuntimeException("Exception: / by zero");
                resultArr[i] = arr1[i] / arr2[i];
            }
            return resultArr;
        } else throw new RuntimeException("arr1.length != arr2.length");
    }

}
