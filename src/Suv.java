public class Suv extends Car {
    public Suv(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(id, make, model, year, gearboxType, colour, mileage, vin);
    }

    private boolean hasAllWheelDrive = false;

    // Setter to add all-wheel drive.
    public void addAllWheelDrive() {
        this.hasAllWheelDrive = true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("SUV:\n").append(super.toString());
        if (hasAllWheelDrive) {
            result.append("\nAll Wheel Drive");
        }
        return result.toString();
    }

}
