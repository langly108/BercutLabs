package Task1;

import com.bercut.labs.Task1.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void swapOutOfBoundsBoth() {
        int[] arr = new int[]{1, 2, 6, 234, 54, 12, 23};
        int var1 = 12;
        int var2 = 13;
        boolean t = Task1.swap(var1, var2, arr);
        Assert.assertFalse(t);
    }

    @Test
    void swapOutOfBoundsFirst() {
        int[] arr = new int[]{1, 2, 6, 234, 54, 12, 23};
        int var1 = 12;
        int var2 = 3;
        boolean t = Task1.swap(var1, var2, arr);
        Assert.assertFalse(t);
    }

    @Test
    void swapEmptyArray() {
        int[] arr = new int[0];
        int var1 = 1;
        int var2 = 2;
        boolean t = Task1.swap(var1, var2, arr);
        Assert.assertFalse(t);
    }

    @Test
    void swapOutOfBoundsSecond() {
        int[] arr = new int[]{1, 2, 6, 234, 54, 12, 23};
        int var1 = 3;
        int var2 = 12;
        boolean t = Task1.swap(var1, var2, arr);
        Assert.assertFalse(t);
    }

    @Test
    void swapNormal() {
        int[] arr = new int[]{1, 2, 6, 234, 54, 12, 23};
        int var1 = 0;
        int var2 = 4;
        int[] arrRes = new int[]{54, 2, 6, 234, 1, 12, 23};
        boolean t = Task1.swap(var1, var2, arr);
        Assert.assertTrue(t);
        Assert.assertArrayEquals(arr, arrRes);
    }
}