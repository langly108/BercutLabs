import java.util.Arrays;

public class Task3 {

    public static double avg(int[] speeds) {
        int shipNum = speeds.length;
        long buf = 0;
        for (int speed : speeds) {
            buf += speed;
        }
        return (double) buf / shipNum;
    }

    public static int min(int[] speeds) {
        return Arrays.stream(speeds).min().getAsInt();
    }

    public static void main(String[] args) {
        Spaceship enterprise = new Spaceship(700);
        Spaceship milleniumFalcon = new Spaceship(750);
        Spaceship hyperion = new Spaceship(1000);

        int[] speeds = new int[]{enterprise.getSpeed(), milleniumFalcon.getSpeed(), hyperion.getSpeed()};

        System.out.println("Average speed: " + avg(speeds));
        System.out.println("Minimum speed: " + min(speeds));

    }
}
