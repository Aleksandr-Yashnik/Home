import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class HomeWork16_Mobile {
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
    public double batteryCharge;
    public int maxCharge;
    private String installedApplications;

    private String name;

    public HomeWork16_Mobile(String deviceModel, String operatingSystemOfTheDevice, String installedApplications, String batteryCharge, String maxCharge, String name) {
        this.deviceModel = deviceModel;
        this.operatingSystemOfTheDevice = operatingSystemOfTheDevice;
        this.installedApplications = "";
        this.batteryCharge = 50;
        this.maxCharge = 100;
        this.name = name;
    }

    // Метод  заряда батареи
    public void chargeBattery(int charge) {
        batteryCharge += charge;
        if (batteryCharge > maxCharge) {
            batteryCharge = maxCharge;
        }
        System.out.println("Модель устройства:" + deviceModel + ", Заряд акамулятора:" + charge);
    }
// Инсталяция приложений
    public void installApp(String[] name) {
        String[] installedApplications = new String[4];
        installedApplications[0] = "Instagram";
        installedApplications[1] = " игра Бегемот";
        installedApplications[2] = "Фейсбук";
        String nameInstalledApplications = installedApplications[1]+" " + installedApplications[2]+" " + installedApplications[0];
        System.out.println(nameInstalledApplications);

    }
// Удаление приложения
    public void uninstallApp(String[] name) {
        String[] array = new String[]{"Instagram", "игра Бегемот", "Фейсбук"};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        list.remove("игра Бегемот");
        array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
    }
//Заряд акамулятора
    public void showBatteryLevel(int bat) {
        batteryCharge += bat;
        if (batteryCharge > maxCharge) {
            batteryCharge = maxCharge;
        }
        if (batteryCharge < 0) {
            batteryCharge = 0;
        }
        System.out.println("Модель :" + deviceModel + ", Заряд батереи: " + batteryCharge);
    }

    public void version(String ver) {
        System.out.println(operatingSystemOfTheDevice = ver);
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


    public double getBatteryCharge() {
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
