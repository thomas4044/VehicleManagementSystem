public class Hatchback extends Car{
    public Hatchback(String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(make, model, year, gearboxType, colour, mileage, vin);
    }

    @Override
    public String toString() {
        return "Hatchback: " + super.toString();
    }
}
