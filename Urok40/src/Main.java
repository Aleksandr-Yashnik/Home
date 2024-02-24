public class Main {
    public static void main(String[] args) {
        Car car = new Car("Audi", 120,200,0.11);
        car.setPassengers(3);

        System.out.println(car.calculeteFuelCansumption(600));

        FreirghtReain train = new FreirghtReain(50,80,5000,0.2);
        train.setCargo(60000);
        System.out.println(train.calculeteFuelCansumption(600));
    }
}
