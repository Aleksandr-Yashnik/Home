import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите электронный адрес:");
        String email = scanner.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Электронный адрес верный");
        } else {
            System.out.println("Некорректный электронный адрес");
        }
    }

    private static boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9_]+@[a-zA-Z]+\\.[a-zA-Z]{2,3}$";
        return Pattern.matches(emailRegex, email);
    }
}

