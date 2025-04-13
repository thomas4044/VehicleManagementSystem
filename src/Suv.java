public class Suv extends Car {
    public Suv(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(id, make, model, year, gearboxType, colour, mileage, vin);
    }

    boolean hasAllWheelDrive = false;

    // Setter to add all-wheel drive.
    public void addAllWheelDrive() {
        this.hasAllWheelDrive = true;
    }

    @Override
    public String toString() {
        return "\nEntry ID:\t" + getId() + "\nSUV:" + super.toString() + getAdditionalOptions();
    }

}
