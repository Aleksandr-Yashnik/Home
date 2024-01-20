import java.util.Arrays;
import java.util.Random;

public class BinarySearch {
    // Функция для поиска первого вхождения числа в массиве
    static int searchFirst(int arr[], int num) {
        int low = 0, high = arr.length - 1, firstIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == num) {
                firstIndex = mid;
                high = mid - 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return firstIndex;
    }

    // Функция для поиска последнего вхождения числа в массиве
    static int searchLast(int arr[], int num) {
        int low = 0, high = arr.length - 1, lastIndex = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == num) {
                lastIndex = mid;
                low = mid + 1;
            } else if (arr[mid] < num) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return lastIndex;
    }

    public static void main(String[] args) {
//        int[] arr = new int[200];
//        Random random = new Random();
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = random.nextInt(50);
//
//        }
        int[] arr = {10, 34, 2, 34, 34, 4, 5, 60, 63,75,50,50,30,31,40,40,40,40,25,25};
        Arrays.sort(arr);
        System.out.println("Отсортированный массив: " + Arrays.toString(arr));
        int num = 8;
        int firstOccurrence = searchFirst(arr, num);
        int lastOccurrence = searchLast(arr, num);
        System.out.println("Индекс первого вхождения: " + firstOccurrence);
        System.out.println("Индекс последнего вхождения: " + lastOccurrence);
    }
}

