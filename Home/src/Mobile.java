import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Mobile {


    public static void main(String[] args) {


        HomeWork16_Mobile Apple = new HomeWork16_Mobile("Iphone ", "bionic 17", "", "80", "100", "Googl");

        HomeWork16_Mobile Apple1 = new HomeWork16_Mobile("Iphone ", "bionic 17", "", "80", "100", "Googl");

        HomeWork16_Mobile Samsung = new HomeWork16_Mobile("Samsung S30", "Android 18", "", "80", "100", "Googl");

        HomeWork16_Mobile Motorola = new HomeWork16_Mobile("Motorola Y15", "Android 15", "", "80", "100", "Googl");

        System.out.println("Инстал прироложения");
        Apple.installApp(new String[]{""});
        System.out.println();

        System.out.println(" Удаление Приложений");
        Apple.uninstallApp(new String[]{""});
        System.out.println();

        System.out.println(" Заряд батереии");
        Apple.showBatteryLevel(80);
        System.out.println();
        Apple.chargeBattery(30);
        System.out.println();

        System.out.println(" Сравниваем два телефона");
        Apple1.equals(Apple);
        System.out.println();
        Apple.equals(Motorola);
        System.out.println();

        System.out.println("Версия ОП");
        Apple.version("18");


        }
    }



