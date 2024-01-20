import java.util.Arrays;

public class GenericSwap {

    // Обобщенный метод swap для обмена элементами по заданным индексам в массиве
    public static <T> void swap(T[] array, int index1, int index2) {
        // Проверка допустимости индексов
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            throw new IllegalArgumentException("Invalid indices");
        }

        // Обмен элементов
        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Пример использования метода swap с массивом целых чисел
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(intArray));

        swap(intArray, 1, 3); // Обмен элементов с индексами 1 и 3
        System.out.println("Array after swapping: " + Arrays.toString(intArray));

        // Пример использования метода swap с массивом строк
        String[] stringArray = {"Машина", "Рыба", "Ложка"};
        System.out.println("Original array: " + Arrays.toString(stringArray));

        swap(stringArray, 0, 2); // Обмен элементов с индексами 0 и 2
        System.out.println("Array after swapping: " + Arrays.toString(stringArray));
    }
}
