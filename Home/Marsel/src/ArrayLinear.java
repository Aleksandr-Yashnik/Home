
import java.util.*;


public class ArrayLinear {
    public static void main(String[] args) {
        int[] array = new int[1000000];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1001);

        }
        Map<Integer, Integer> counter = new HashMap<>();
        for (int number : array) {
            counter.put(number, counter.getOrDefault(number, 0) + 1);
           // System.out.println(number);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(counter.entrySet());
        entryList.sort((a, b) -> {
            int result = Integer.compare(b.getValue(), a.getValue());
            return result != 0 ? result : Integer.compare(a.getKey(), b.getKey());
        });
        for (int i = 0; i < Math.min(3,entryList.size()); i++) {
            System.out.println("Вывод  элементов :" + entryList.get(i).getKey() + " ");

        }
    }
}









