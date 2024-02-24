public class FunctionalInterfacesExample {
    public static void main(String[] args) {
        // Пример использования функционального интерфейса Action
        Action<Integer> increment = number -> System.out.println("Incremented number: " + (number + 1));
        increment.execute(5); // Вывод: Incremented number: 6

        // Пример использования функционального интерфейса Condition
        Condition<String> isNotEmpty = str -> !str.isEmpty();
        System.out.println("Is string not empty? " + isNotEmpty.test("Hello")); // Вывод: Is string not empty? true

        // Пример использования функционального интерфейса Provider
        Provider<Double> piProvider = () -> Math.PI;
        System.out.println("Value of PI: " + piProvider.provide()); // Вывод: Value of PI: 3.141592653589793
    }
}
