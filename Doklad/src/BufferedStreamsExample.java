import java.io.*;

public class BufferedStreamsExample {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("F:\\Java\\Home\\Doklad\\src" +
                "\\fille1.txt")); // Создаем буферизированный входной поток для чтения из файла
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Java\\Home\\Doklad" +
                     "\\src\\output.txt"))) { // Создаем буферизированный выходной поток для записи в файл

            byte[] buffer = new byte[1024]; // Создаем буфер размером 1024 байта
            int bytesRead; // Переменная для хранения количества прочитанных байтов
            while ((bytesRead = bis.read(buffer)) != -1) { // Читаем данные из входного потока в буфер,
                // пока не достигнем конца файла (-1)
                bos.write(buffer, 0, bytesRead); // Записываем данные из буфера в выходной поток
            }

            System.out.println("Data copied successfully."); // Выводим сообщение об успешном копировании данных

        } catch (IOException e) { // Обработка исключения ввода-вывода
            e.printStackTrace(); // Вывод информации об исключении
        }
    }
}
