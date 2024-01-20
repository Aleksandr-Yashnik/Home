import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MobileDeviceTest {

    @Test
    public void testInstallApp() {
        // Тест установки приложения
        HomeWork16_Mobile phone = new HomeWork16_Mobile("Simens", "18",
                20.0, " ");
        phone.installApp("App1");
        assertTrue("App1".stripLeading().contains("App1"));

        // Тест повторной установки приложения
         phone.installApp("App1");
        assertTrue("App1".stripLeading().contains("App1"));

    }

    @Test
    public void testUninstallApp() {
        // Тест удаления установленного приложения
        HomeWork16_Mobile phone = new HomeWork16_Mobile("Simens", "18",
                20.0, " ");
        phone.installApp("App2");
        phone.uninstallApp("App2");
        assertTrue("App2".stripLeading().contains("App2"));

       // Тест удаления неустановленного приложения
        phone.uninstallApp("App3");

   }

    @Test
    public void testShowBatteryLevel() {
        // Тест заряда аккумулятора
        HomeWork16_Mobile phone = new HomeWork16_Mobile("Simens", "18", 20.0, "Feisbuk");
        phone.showBatteryLevel(30.0);
        assertEquals(50.0, phone.getBatteryCharge(), 0.01);

        //Тест переполнения заряда аккумулятора
        phone.showBatteryLevel(82.0);
        assertEquals(100.0, phone.getBatteryCharge(), 0.01);

        // Тест отрицательного заряда аккумулятора
        phone.showBatteryLevel(-100.0);
        assertEquals(0.0, phone.getBatteryCharge(), 0.01);
    }

    @Test
    public void testUpdateFirmware() {
        // Тест обновления прошивки
        MobileDevice phone = new MobileDevice("Model X", "OS 1.0", 100, "Instagram");
        phone.updateFirmware("OS 2.0");
        assertEquals("OS 2.0", phone.getOperatingSystemOfTheDevice());

    }
}