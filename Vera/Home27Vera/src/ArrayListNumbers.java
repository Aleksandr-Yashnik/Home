import java.util.ArrayList;
import java.util.Random;

public class ArrayListNumbers {
    static ArrayList<Integer> numbers;
    static ArrayList<Integer> numbers2;

    public static void main(String[] args) {
        numbers = new ArrayList<>();
        Random ran = new Random();
        // добавление элементов в ArrayList
        for (int i = 0; i < 30; i++) {
            numbers.add(ran.nextInt(50));
        }
        System.out.println(numbers);
        int min = findMinNumber(numbers);
        int max = findMaxNumber(numbers);
        int middle = findMiddleNumber(numbers);

        System.out.println("Минимальное число в списке - " + min + ", максимальное число - " + max + " среднее арифметическое элементов списка равно " + middle);

        numbers2 = new ArrayList<>();

        primeNumber();

        System.out.println(numbers2);

    }

    // метод для поиска минимального числа в списке
    static int findMinNumber(ArrayList<Integer> arr) {
        int min = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }

    // метод для поиска максимального числа в списке
    static int findMaxNumber(ArrayList<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    // метод для поиска среднего арифметического элементов списка
    static int findMiddleNumber(ArrayList<Integer> arr) {
        int summ = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            summ += arr.get(i);
        }
        return summ / arr.size();
    }

    // метод для извлечения все простых чисел
    static void primeNumber() {
        OUTER:
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 2; j < (numbers.get(i) / 2); j++) {
                if (numbers.get(i) != 1 && numbers.get(i) % j == 0) continue OUTER;
            }
            numbers2.add(numbers.get(i));
        }

    }
}
