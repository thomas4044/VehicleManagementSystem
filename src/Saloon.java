public class Saloon extends Car {

    public Saloon(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(id, make, model, year, gearboxType, colour, mileage, vin);

    }

    @Override
    public String toString() {
        return "\nEntry ID:\t" + getId() + "\nSaloon car:" + super.toString() + getAdditionalOptions();
    }
}
