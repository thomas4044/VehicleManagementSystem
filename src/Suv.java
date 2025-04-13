public class Suv extends Car {
    public Suv(String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(make, model, year, gearboxType, colour, mileage, vin);
    }
    private boolean hasAllWheelDrive = false;

    @Override
    public String toString() {
        return super.toString();
    }

}
