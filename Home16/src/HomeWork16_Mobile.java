
import java.util.*;

public class HomeWork16_Mobile {
    /**
     * Задание 1: Мобильное Устройство
     * Объект Реализации: Смартфон
     * Поля:
     * модель: Модель устройства.
     * операционнаяСистема: Операционная система устройства.
     * зарядБатареи: Процент заряда батареи.
     * списокПриложений: Установленные приложения.
     * Меоды:
     * установитьПриложение(приложение): Добавляет приложение в список установленных.
     * удалитьПриложение(приложение): Удаляет приложение из списка.
     * показатьЗарядБатареи(): Отображает текущий заряд батареи.
     * обновитьОС(версия): Обновляет операционную систему до указанной версии.
     */
    private String deviceModel;
    private String operatingSystemOfTheDevice;
    public static double batteryCharge;
    public int maxCharge;
    private String installedApplications;


    public HomeWork16_Mobile(String deviceModel, String operatingSystemOfTheDevice, double batteryCharge,
                             String installedApplications) {
        this.deviceModel = deviceModel;
        this.operatingSystemOfTheDevice = operatingSystemOfTheDevice;
        this.batteryCharge = batteryCharge;
        this.installedApplications = installedApps.toString();

    }
    private Collection<Object> installedApps = new HashSet<Object>();
    public void installApp(String app) {
        if (installedApps.contains(app)) {
            System.out.println("Приложение уже установлено.");
        } else {
            installedApps.add(app);
            System.out.printf("Модель:%s, Операционная система устройства:%s, Процент заряда батареи:%s," +
                    " Установленное приложение: %s ", this.deviceModel, this.operatingSystemOfTheDevice,
                    this.batteryCharge ,this.installedApplications + app);
        }
   }

// Удаление приложения
public void uninstallApp(String app) {
    if (installedApps.contains(app)) {
        installedApps.remove(app);
        System.out.println("Приложение успешно удалено.");
    } else {
        System.out.println("Приложение не установлено.");
    }
    System.out.printf("Модель:%s  Операционная система устройства:%s Процент заряда батареи:%s " +
            "Установленные приложения:%s", this.deviceModel, this.operatingSystemOfTheDevice, this.batteryCharge,
            installedApps);
}

//Заряд акамулятора
public void showBatteryLevel(double bat) {
    batteryCharge += bat;
    if (batteryCharge > 100) {
        batteryCharge = 100;
    }
    if (batteryCharge < 0) {
        batteryCharge = 0;
    }
}

public  void updateFirmware(String version) {
    System.out.printf("Модель:%s  Операционная система устройства:%s Процент заряда батареи:%s " +
            "Установленные приложения:%s", this.deviceModel, version, this.batteryCharge,   installedApps);
}

//Сравневаем два устройства
@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null || !(obj instanceof HomeWork16_Mobile)) {
        return false;
    }
    HomeWork16_Mobile mob = (HomeWork16_Mobile) obj;
    if (this.deviceModel == mob.deviceModel) {
        if (this.operatingSystemOfTheDevice.equals(mob.operatingSystemOfTheDevice)) {
            System.out.println("Телефоны одинаковые по совокупности признаков - модель и операционная система");
            return true;
        } else {
            System.out.println("У телефонов разный производитель");
            return false;
        }
    } else {
        System.out.println("У телефонов разная  модель, производитель, ОП");
        return false;
    }

}

public void showInfo() {
    System.out.printf("Модель:%s  Операционная система устройства:%s Процент заряда батареи:%s " +
            "Установленные приложения:%s", this.deviceModel, this.operatingSystemOfTheDevice, this.batteryCharge,
            installedApps);
}


public static double getBatteryCharge() {
    return batteryCharge;
}

public void setBatteryCharge(int batteryCharge) {
    this.batteryCharge = batteryCharge;
}

public int getMaxCharge() {
    return maxCharge;
}

public void setMaxCharge(int maxCharge) {
    this.maxCharge = maxCharge;
}

public String getDeviceModel() {
    return deviceModel;
}

public void setDeviceModel(String deviceModel) {
    this.deviceModel = deviceModel;
}

public String getOperatingSystemOfTheDevice() {
    return operatingSystemOfTheDevice;
}

public void setOperatingSystemOfTheDevice(String operatingSystemOfTheDevice) {
    this.operatingSystemOfTheDevice = operatingSystemOfTheDevice;
}

public String getInstalledApplications() {
    return installedApplications;
}


public void setInstalledApplications(String installedApplications) {
    this.installedApplications = installedApplications;
}


}

