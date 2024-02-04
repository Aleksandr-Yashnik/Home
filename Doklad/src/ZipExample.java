import java.io.*;
import java.util.zip.*;

public class ZipExample {
    public static void main(String[] args) {
        String sourceFile1 = "F:\\Java\\Home\\Doklad\\src\\fille1.txt"; // Путь к первому файлу
        String sourceFile2 = "F:\\Java\\Home\\Doklad\\src\\file2.txt"; // Путь к второму файлу
        String zipFileName = "F:\\Java\\Home\\Doklad\\src\\archive.zip"; // Имя ZIP-архива, который мы создадим

        try {
            // Создание нового ZIP-архива и потока вывода для записи в него
            FileOutputStream fos = new FileOutputStream(zipFileName);
            ZipOutputStream zos = new ZipOutputStream(fos);

            // Добавление файлов в ZIP-архив
            addToZipFile(sourceFile1, zos); // Добавление первого файла
            addToZipFile(sourceFile2, zos); // Добавление второго файла


            // Закрытие потоков
            zos.close();
            fos.close();

            System.out.println("ZIP archive created successfully."); // Вывод сообщения об успешном создании архива
            extractFromZipFile(zipFileName, "extracted_files"); // Извлечение файлов в директорию "extracted_files"
            System.out.println("Files extracted successfully."); // Вывод сообщения об успешном извлечении файлов
        } catch (IOException e) { // Обработка возможных исключений ввода-вывода
            e.printStackTrace(); // Вывод стека вызовов исключения
        }
    }



    // Метод для добавления файла в ZIP-архив
    private static void addToZipFile(String fileName, ZipOutputStream zos) throws IOException {
        FileInputStream fis = new FileInputStream(fileName); // Поток ввода для чтения содержимого файла
        ZipEntry zipEntry = new ZipEntry(fileName); // Создание новой записи в архиве с именем файла
        zos.putNextEntry(zipEntry); // Добавление записи в архив

        byte[] bytes = new byte[1024]; // Буфер для чтения данных из файла
        int length;
        while ((length = fis.read(bytes)) >= 0) { // Чтение данных из файла в буфер
            zos.write(bytes, 0, length); // Запись данных из буфера в ZIP-архив
        }

        fis.close(); // Закрытие потока чтения файла
        zos.closeEntry(); // Завершение записи в архиве
    }

    private static void extractFromZipFile(String zipFileName, String destDirectory) throws IOException {
        File destDir = new File(destDirectory); // Создание объекта для целевой директории извлечения файлов
        if (!destDir.exists()) { // Проверка существования директории
            destDir.mkdir(); // Создание директории, если она не существует
        }
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("F:\\Java\\Home\\Doklad\\src\\archive.zip"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                // Создание файла из ZipEntry
                try (FileOutputStream fos = new FileOutputStream(entry.getName())) {
                    byte[] buffer = new byte[1024];
                    int length;
                    while ((length = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, length);
                    }
                    zis.closeEntry();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
