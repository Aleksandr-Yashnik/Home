public  class MobileDevice extends HomeWork16_Mobile implements Updatable{
    public MobileDevice (String deviceModel,String operatingSystemOfTheDevice,double batteryCharge,String  installedApplications){
        super(deviceModel,operatingSystemOfTheDevice,batteryCharge,installedApplications);
    }

    @Override
   public  void updateFirmware(String version) {
        setOperatingSystemOfTheDevice(version);

   }

    public  void showBatteryLevel(double bat){
        System.out.println("Заряд батереи" + bat);
    }
}
