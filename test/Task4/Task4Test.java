package Task4;

import com.bercut.labs.Task4.Code.Task4;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class TestObject {
    int field;

    public int getField() {
        return field;
    }

    public TestObject(int field) {
        this.field = field;
    }
}


class Task4Test {

    @Test
    void swapOutOfBounds() {
        int i = 10;
        int j = 4;
        Integer[] strArr = new Integer[]{1, 5, 6};
        boolean t = Task4.swap(i, j, strArr);
        Assert.assertFalse(t);
    }

    @Test
    void swapString() {
        int i = 2;
        int j = 4;
        String[] strArr = new String[]{"fgjhsdf", "gfeg2", "tt432", "qwerty", "iiioooo"};
        String[] expectedArr = new String[]{"fgjhsdf", "gfeg2", "iiioooo", "qwerty", "tt432"};
        boolean t = Task4.swap(i, j, strArr);
        Assert.assertArrayEquals(expectedArr, strArr);
    }

    @Test
    void swapInteger() {
        int i = 2;
        int j = 4;
        Integer[] intArr = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        Integer[] expectedArr = new Integer[]{1, 2, 5, 4, 3, 6, 7};
        boolean t = Task4.swap(i, j, intArr);
        Assert.assertArrayEquals(expectedArr, intArr);
    }

    @Test
    void swapChar() {
        int i = 2;
        int j = 4;
        Character[] charArr = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        Character[] expectedArr = new Character[]{'a', 'b', 'e', 'd', 'c', 'f', 'g'};
        boolean t = Task4.swap(i, j, charArr);
        Assert.assertArrayEquals(expectedArr, charArr);
    }

    @Test
    void swapObjects() {
        int i = 1;
        int j = 3;
        TestObject[] objArr = new TestObject[]{new TestObject(50), new TestObject(60), new TestObject(80), new TestObject(100)};
        int hashCode1 = objArr[3].hashCode();
        int hashCode2 = objArr[1].hashCode();
        boolean t = Task4.swap(i, j, objArr);

        //сравнения полей
        Assert.assertEquals(60, objArr[3].getField());
        Assert.assertEquals(100, objArr[1].getField());

        //сравнения объектов (непонятно как напрямую сравнивать, поэтому так)
        Assert.assertEquals(hashCode2, objArr[3].hashCode());
        Assert.assertEquals(hashCode1, objArr[1].hashCode());
    }

    @Test
    void swapRandomObjects() {
        int i = 1;
        int j = 3;
        Object[] objArr = new Object[]{new TestObject(50), "tt567", false, -20, 'b', 12345L};
        int hashCode1 = objArr[0].hashCode();
        boolean t = Task4.swap(i, j, objArr);

        //сравнения полей
        Assert.assertEquals(-20, objArr[1]);
        Assert.assertEquals("tt567", objArr[3]);

    }

}