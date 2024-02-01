import java.util.HashMap;
import java.util.Map;

public class LanguageCard<K, V> {
    private Map<K, V> wordMap; // Основная Map для хранения слов и их переводов
    private Map<K, Integer> mistakeCountMap; // Map для хранения количества ошибок для каждого слова

    public LanguageCard() {
        wordMap = new HashMap<>();
        mistakeCountMap = new HashMap<>();
    }

    public void addWord(K key, V value) {
        wordMap.put(key, value); // Добавление слова и его перевода в основную Map
        mistakeCountMap.put(key, 0); // Инициализация количества ошибок для этого слова как 0
    }

    public void incrementMistakeCount(K key) {
        if (mistakeCountMap.containsKey(key)) {
            int count = mistakeCountMap.get(key); // Получение текущего количества ошибок для слова
            mistakeCountMap.put(key, count + 1); // Увеличение количества ошибок на 1 и сохранение обновленного значения
        } else {
            mistakeCountMap.put(key, 1); // Если слова нет в Map, устанавливаем количество ошибок равным 1
        }
    }

    public static void main(String[] args) {
        LanguageCard<String, String> card = new LanguageCard<>();
        card.addWord("hello", "привет");
        card.addWord("book", "книга");
        card.addWord("tree", "дерево");

        card.incrementMistakeCount("hello"); // Увеличиваем количество ошибок для слова "hello"
        card.incrementMistakeCount("hello"); // Снова увеличиваем количество ошибок для слова "hello"
        card.incrementMistakeCount("book"); // Увеличиваем количество ошибок для слова "book"
        card.incrementMistakeCount("book"); // Увеличиваем количество ошибок для слова "book"
        card.incrementMistakeCount("book"); // Увеличиваем количество ошибок для слова "book"

        System.out.println("wordMap: " + card.wordMap); // Выводим содержимое основной Map
        System.out.println("mistakeCountMap: " + card.mistakeCountMap); // Выводим содержимое Map с количеством ошибок
    }
}