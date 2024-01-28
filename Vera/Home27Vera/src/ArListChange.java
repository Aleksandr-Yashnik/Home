import java.util.ArrayList;
import java.util.Iterator;

public class ArListChange {
    static ArrayList<String> nameForPet;

    public static void main(String[] args) {

        nameForPet = new ArrayList<>();
        nameForPet.add("Deni");
        nameForPet.add("Tim");
        nameForPet.add("Jaff");
        nameForPet.add("Mick");
        nameForPet.add("Mailo");
        nameForPet.add("Bo");
        // первоначальный ArrayList
        System.out.println(nameForPet);
        //вызов метода для удаления коротких строк
        removeShortString( 2);
        //конечный вариант ArrayList
        System.out.println(nameForPet);

    }
    //метод для удаления строк короче определенной длины
    public static void removeShortString(int size) {
        Iterator<String> iterator = nameForPet.iterator();
        while (iterator.hasNext()) {
            String var = iterator.next();
            if (var.length() <= size) {
                iterator.remove(); // Безопасное удаление элемента
            } else {
                nameForPet.set(nameForPet.indexOf(var), var.toUpperCase());
            }
        }
    }

}
