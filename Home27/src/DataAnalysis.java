import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class DataAnalysis {
    public static void main(String[] args) {
        // Создание и заполнение ArrayList строками
        List<String> stringList = new ArrayList<>();
        stringList.add("Телефон");
        stringList.add("Машина");
        stringList.add("Яблоко");
        stringList.add("Компьютер");
        stringList.add("Снег");
        // Удаление строк короче 6 символов и вывод результата
        removeShortString(stringList, 5);
        System.out.println("Строки после удаления коротких: " + stringList);
        // Преобразование всех строк в верхний регистр и вывод результата
        toUpperCase(stringList);
        System.out.println("Строки в верхнем регистре: " + stringList);
        // Заполнение ArrayList случайными числами
        List<Integer> numberList = generateRandomNumbers(10);
        System.out.println("Случайные числа: " + numberList);
        // Нахождение максимального, минимального и среднего значений
        System.out.println("Max: " + findMax(numberList));
        System.out.println("Min: " + findMin(numberList));
        System.out.println("Average: " + findAverage(numberList));

        // Нахождение всех простых чисел в списке и вывод результата
        List<Integer> primeNumbers = findPrimeNumbers(numberList);
        System.out.println("Простые числа: " + primeNumbers);
    }

    // Метод для удаления строк короче заданной длины
    public static void removeShortString(List<String> list, int size) {
        list.removeIf(str -> str.length() < size);
    }

    // Метод для преобразования всех строк в верхний регистр
    public static void toUpperCase(List<String> list) {
        list.replaceAll(String::toUpperCase);
    }

    // Метод для генерации случайных чисел в ArrayList
    public static List<Integer> generateRandomNumbers(int count) {
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(100));
        }
        return numbers;
    }

    // Метод для нахождения максимального значения в списке
    public static int findMax(List<Integer> list) {
        return Collections.max(list);
    }

    // Метод для нахождения минимального значения в списке
    public static int findMin(List<Integer> list) {
        return Collections.min(list);
    }

    // Метод для нахождения среднего значения в списке
    public static double findAverage(List<Integer> list) {
        return list.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
    }

    // Метод для нахождения всех простых чисел в списке
    public static List<Integer> findPrimeNumbers(List<Integer> list) {
        List<Integer> primes = new ArrayList<>();
        for (int number : list) {
            if (isPrime(number)) {
                primes.add(number);
            }
        }
        return primes;
    }

    // Вспомогательный метод для проверки, является ли число простым
    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

