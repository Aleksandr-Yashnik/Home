import java.util.Arrays;

public class Mobile {


    public static void main(String[] args) {


        HomeWork16_Mobile Apple = new HomeWork16_Mobile("Iphone ", "bionic 17",
                20, "Googl");

        HomeWork16_Mobile Apple1 = new HomeWork16_Mobile("Iphone ", "bionic 17",
                20, "Googl");

        HomeWork16_Mobile Samsung = new HomeWork16_Mobile("Samsung S30",
                "Android 18",
                20, "Googl");

        HomeWork16_Mobile Motorola = new HomeWork16_Mobile("Motorola Y15",
                "Android 15", 20, "Googl");

        //Инстал приложений
        HomeWork16_Mobile appInstaller  = new HomeWork16_Mobile(Apple.getDeviceModel(), Apple1.getDeviceModel(),
                Motorola.batteryCharge, Samsung.getDeviceModel());
        System.out.println("Инстал приложения");
       Apple.installApp("Instagram");
        System.out.println();
        Apple.installApp("Feisbuk");
        System.out.println();
        Apple.installApp("Instagram");
        //Удаляем приложение
        System.out.println("Удаление");
        Apple.uninstallApp("Instagram");
        Apple.uninstallApp("Odnoklasniki");
        System.out.println();
        //Заряд батереи
        System.out.println(" Заряд батереии");
        Apple.showBatteryLevel(20);
        Apple.showInfo();
        System.out.println();
//Сравнение
        System.out.println(" Сравниваем два телефона");
        Apple1.equals(Apple);
        Apple.equals(Motorola);
        System.out.println();

        System.out.println("Версия ОП");
        Apple.showInfo();
        System.out.println();
        Apple.updateFirmware("bionic 20");


    }
}



