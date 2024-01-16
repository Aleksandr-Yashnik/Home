import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 23, 41, 55, 55, 55, 72, 72, 121, 121, 121, 323, 756, 756, 900, 900};
        int numberToFind = 55;

        //int firstIndex = 0;
        //int lastIndex = 0;

        int index = binarySearch(arr, numberToFind);

        if (index == -1) {
           System.out.println("Такого элемента нет в массиве");
        } else
            System.out.printf("Элемент имеет индекс %d", index);
    }

    public static int binarySearch(int[] arr, int numberToFind) {
        int l1 = 0, l2 = arr.length - 1, firstIndex ;
        while (l1 <= l2) {
            int mid = l1 + (l2 - l1) / 2;
            if (arr[mid]==numberToFind) {
                firstIndex = mid;
                l2 = mid - 1;
               // return mid; тут это не надо тут выводим элемент 1 вхождения
return firstIndex;
            }
            else if (arr[mid]<numberToFind ) {
                l1 = mid - 1;
            } else {
                l2 = mid + 1;
            }

        }
        return +1;
    }
}