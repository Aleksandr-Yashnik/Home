public class Car extends Vehicle implements PeopleTransport {
    private String model;
    private int passengers;

    public Car( String model,double speed, double fuelAmount, double fuelPerKm) {
        super(speed, fuelAmount, fuelPerKm);
        this.model= model;
        passengers = 0;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public double calculeteFuelCansumption(double distance) {
        System.out.println( "Путь займет" + distance / speed + "ч");
        return distance * (fuelPerKm + calculatePasengersConsuptionPerKm());
    }

    @Override
    public double calculatePasengersConsuptionPerKm() {
        return passengers * 0.001 * fuelPerKm;
    }

    @Override
    public void setPassengers(int passengers) {
this.passengers = passengers;

    }

    @Override
    public int getPassengers() {
        return passengers;
    }
}
