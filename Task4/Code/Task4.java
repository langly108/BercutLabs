package Code;

import java.util.Arrays;

public class Task4 {

    public static boolean swap(int i, int j, Object[] anArray) {
        int len = anArray.length;
        //Проверка на переполнение
        if ((i > len - 1) || (j > len - 1) || (len == 0)) {
            return false;
        }
        Object buf;
        buf = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = buf;
        return true;
    }

    public static void main (String[] args) {
        int i = Integer.parseInt(args[0]);
        int j = Integer.parseInt(args[1]);
        Object[] arr = new Object[] { new Spaceship(20), 2, "123sddf", false };
        System.out.println(Arrays.toString(arr));
        swap(i, j, arr);
        System.out.println(Arrays.toString(arr));
    }
}
