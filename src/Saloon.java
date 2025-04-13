public class Saloon extends Car {

    public Saloon(String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(make, model, year, gearboxType, colour, mileage, vin);

    }

    @Override
    public String toString() {
        return "Saloon Car:\n" + super.toString();
    }
}
