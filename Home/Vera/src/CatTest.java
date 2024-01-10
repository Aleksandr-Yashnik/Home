public class CatTest {

    public static void main(String[] args) {
        Cat cat1 = new Cat("grey", "british");
        cat1.setName("Anton");
        cat1.setAge(30);
        cat1.showInfo();


        cat1.makeSound();
        cat1.sleep();
        cat1.eat("fish");
        cat1.play("ball");
        cat1.groom();
        cat1.eat("fish");


        Cat cat2 = new Cat("red", "persian");
        cat2.setName("Vasilij");
        cat2.setAge(2);
        cat2.showInfo();
        cat2.groom();

        boolean isSameRace = cat1.equals(cat2);
        System.out.println("Порода у котов одинаковая? " + isSameRace);

    }
}
