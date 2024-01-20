
import org.junit.Test;

import static org.junit.Assert.*;

public class GenericSwapTest {

    @Test
    public void testSwapIntegerArray() {
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Обмен элементов с индексами 1 и 3
        GenericSwap.swap(intArray, 1, 3);
        Integer[] expectedIntArray = {1, 4, 3, 2, 5};
        assertArrayEquals(expectedIntArray, intArray);
    }


    @Test
    public void testSwapStringArray() {
        String[] stringArray = {"apple", "banana", "cherry"};

        // Обмен элементов с индексами 0 и 2
        GenericSwap.swap(stringArray, 0, 2);
        String[] expectedStringArray = {"cherry", "banana", "apple"};
        assertArrayEquals(expectedStringArray, stringArray);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testInvalidIndices() {
        Integer[] intArray = {1, 2, 3, 4, 5};

        // Попытка обмена элементов с недопустимыми индексами
        GenericSwap.swap(intArray, -1, 6);
    }
}
