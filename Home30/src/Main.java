import java.util.*;

public class Main {
    public static <K, V> void removeSameValues(Map<K, V> map) {
        Set<V> uniqueValues = new HashSet<>();
        Set<K> keysToRemove = new HashSet<>();

        for (Map.Entry<K, V> entry : map.entrySet()) {
            V value = entry.getValue();
            if (value == null) {
                if (uniqueValues.contains(null)) {
                    keysToRemove.add(entry.getKey());
                } else {
                    uniqueValues.add(null);
                }
            } else {
                if (uniqueValues.contains(value)) {
                    keysToRemove.add(entry.getKey());
                } else {
                    uniqueValues.add(value);
                }
            }
        }

        for (K key : keysToRemove) {
            map.remove(key);
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "banana");
        map.put("c", "apple");
        map.put("d", "banana");
        map.put("e", "orange");
        map.put("f", null);
        map.put("g", null);

        System.out.println("Original map: " + map);

        removeSameValues(map);

        System.out.println("Map after removing duplicates: " + map);
    }
}
