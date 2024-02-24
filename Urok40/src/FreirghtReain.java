public class FreirghtReain  extends Vehicle implements CargoTransport{
    private  int cartAmount;
    private  double cargo;

    public FreirghtReain( double cargo,double speed, double fuelAmount, double fuelPerKm) {
        super(speed, fuelAmount, fuelPerKm);
        this.cartAmount= cartAmount;
        cargo = 0;
    }

    @Override
    public double calculeteFuelCansumption(double distance) {
        return distance * (fuelPerKm + cartAmount * 0.1 *fuelPerKm  + calculateCargoConsumptionPerKm());
    }

    public int getCartAmount() {
        return cartAmount;
    }

    public void setCartAmount(int cartAmount) {
        this.cartAmount = cartAmount;
    }

    @Override
    public double calculateCargoConsumptionPerKm() {
        return fuelPerKm * 0.00002 * cargo;
    }

    @Override
    public double getCargo() {
        return cargo;
    }

    @Override
    public void setCargo(double cargo) {

    }
}
