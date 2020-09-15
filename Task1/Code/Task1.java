package Code;

import java.util.Arrays;

public class Task1 {

    public static boolean swap(int i, int j, int[] anArray) {
        int len = anArray.length;
        //Проверка на переполнение
        if ((i > len - 1) || (j > len - 1) || (len == 0)) {
            return false;
        }
        int buf;
        buf = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = buf;
        return true;
    }

    public static void main(String[] args) {
        //аргументы из командной строки
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        int[] arr = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        System.out.println("Initial array: " + Arrays.toString(arr));
        if (swap(i, j, arr)) {
            System.out.println("Result:" + Arrays.toString(arr));
        } else {
            System.out.println("Out of bounds exception");
        }

    }
}
