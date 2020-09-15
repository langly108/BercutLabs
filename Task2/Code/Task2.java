package Code;

public class Task2 {

    public static int min(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b < c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        //Аргументы командной строки
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        System.out.println(min(a, b, c));

    }
}
