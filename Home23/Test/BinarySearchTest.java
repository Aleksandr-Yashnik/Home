import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void testSearchFirst() {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};

        assertEquals(1, BinarySearch.searchFirst(arr, 2)); // Первое вхождение числа 2 находится на индексе 1
        assertEquals(-1, BinarySearch.searchFirst(arr, 6)); // Число 6 не найдено в массиве
        assertEquals(0, BinarySearch.searchFirst(arr, 1)); // Первое вхождение числа 1 находится на индексе 0
    }

    @Test
    public void testSearchLast() {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};

        assertEquals(3, BinarySearch.searchLast(arr, 2)); // Последнее вхождение числа 2 находится на индексе 3
        assertEquals(-1, BinarySearch.searchLast(arr, 6)); // Число 6 не найдено в массиве
        assertEquals(0, BinarySearch.searchLast(arr, 1)); // Последнее вхождение числа 1 находится на индексе 0
    }
}

