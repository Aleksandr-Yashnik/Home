import java.io.*;
import java.util.Scanner;
public class FileHandler {
    // Задание 1: Чтение и запись в файл
    public static void readAndWriteToFile(String fileName) {
        try {
            // Создание и запись текста в файл
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write("Привет\n Я люблю Джава\n");
            writer.close();

            // Чтение текста из файла и вывод в консоль
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();

            // Добавление строки "Hello, World!" в конец файла
            BufferedWriter appendWriter = new BufferedWriter(new FileWriter(fileName, true));
            appendWriter.write("Hello, World!\n");
            appendWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Задание 2: Работа с пользовательским вводом
    public static void writeUserNameToFile(String fileName) {
        try {
            // Запрос имени пользователя
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите ваше имя: ");
            String userName = scanner.nextLine();

            // Запись имени пользователя в файл
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(userName);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Задание 3: Обработка исключений
    public static void handleFileNotFoundException(String fileName) {
        try {
            // Попытка чтения несуществующего файла
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String fileName = "F:\\Java\\Home\\Home33\\src\\text.txt";

        // Задание 1: Чтение и запись в файл
        readAndWriteToFile(fileName);

        // Задание 2: Работа с пользовательским вводом
       // writeUserNameToFile(fileName);

        // Задание 3: Обработка исключений
       // handleFileNotFoundException("nonexistent.txt");
    }
}

