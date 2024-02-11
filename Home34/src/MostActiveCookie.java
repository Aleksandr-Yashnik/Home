import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MostActiveCookie {
    public static void main(String[] cookie_log) {
        // Проверка наличия всех аргументов командной строки
        if (cookie_log.length < 4 || !cookie_log[0].equals("-f") || !cookie_log[2].equals("-d")) {
            System.out.println("Usage:MostActiveCookie -f <filename> -d <date>");
            return;
        }

        // Получение имени файла и даты из аргументов командной строки
        String filename = "F:\\Java\\Home\\Home34\\Resurs\\cookie_log.csv";
        String date = "F:\\Java\\Home\\Home34\\Resurs\\cookie_log.csv";

        try {
            // Подсчет количества вхождений каждого файла cookie для указанной даты
            Map<String, Integer> cookieCounts = countCookies(filename, date);

            // Поиск наиболее активных файлов cookie
            List<String> mostActiveCookies = findMostActiveCookies(cookieCounts);

            // Вывод наиболее активных файлов cookie
            for (String cookie : mostActiveCookies) {
                System.out.println(cookie);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    // Метод для подсчета количества вхождений каждого файла cookie для указанной даты
    private static Map<String, Integer> countCookies(String filename, String date) throws IOException {
        Map<String, Integer> cookieCounts = new HashMap<>();
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;

        // Построчное чтение файла
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            String cookie = parts[0];
            String timestamp = parts[1].substring(0, 10); // Извлечение даты из метки времени

            // Проверка, соответствует ли запись указанной дате
            if (timestamp.equals(date)) {
                // Увеличение счетчика для данного файла cookie
                cookieCounts.put(cookie, cookieCounts.getOrDefault(cookie, 0) + 1);
            }
        }

        // Закрытие потока чтения
        reader.close();
        return cookieCounts;
    }

    // Метод для поиска наиболее активных файлов cookie
    private static List<String> findMostActiveCookies(Map<String, Integer> cookieCounts) {
        List<String> mostActiveCookies = new ArrayList<>();
        int maxCount = 0;

        // Поиск максимального количества вхождений
        for (Map.Entry<String, Integer> entry : cookieCounts.entrySet()) {
            int count = entry.getValue();

            // Обновление списка наиболее активных файлов cookie
            if (count > maxCount) {
                mostActiveCookies.clear();
                mostActiveCookies.add(entry.getKey());
                maxCount = count;
            } else if (count == maxCount) {
                mostActiveCookies.add(entry.getKey());
            }
        }

        return mostActiveCookies;
    }
}

