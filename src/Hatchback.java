public class Hatchback extends Car{
    public Hatchback(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(id, make, model, year, gearboxType, colour, mileage, vin);
    }

    @Override
    public String toString() {
        return "Hatchback: " + super.toString();
    }
}
