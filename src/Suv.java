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
        if (!hasSatNav && !hasParkingSensors && !hasTowBar && !hasRoofRack && !hasAllWheelDrive) {
            result.append("\nNo additional options");
        } else {
            result.append("\nAdditional Options:");
            if (hasSatNav) result.append("\nSat Nav");
            if (hasParkingSensors) result.append("\nParking Sensors");
            if (hasTowBar) result.append("\nTow Bar");
            if (hasRoofRack) result.append("\nRoof Rack");
            if (hasAllWheelDrive) result.append("\nAll-Wheel Drive");
        }
        return result.toString();
    }

}
