package Tests;

import com.bercut.labs.Task3.Code.Task3;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task3Test {

    @Test
    void avgNormal() {
        int[] speeds = new int[]{1500, 2300, 5400};
        double res = Task3.avg(speeds);
        Assert.assertEquals(3066.66, res, 0.01);
    }

    @Test
    void avgOverflow() {
        int[] speeds = new int[]{1500, 2300, Integer.MAX_VALUE};
        double res = Task3.avg(speeds);
        System.out.println(res);
        Assert.assertEquals(7.15829149E8, res, 1);
    }

    @Test
    void minNormal() {
        int[] speeds = new int[]{1500, 2300, 5400};
        int res = Task3.min(speeds);
        Assert.assertEquals(1500, res);
    }
}