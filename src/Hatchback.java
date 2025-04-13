public class Hatchback extends Car{
    public Hatchback(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(id, make, model, year, gearboxType, colour, mileage, vin);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Hatchback car:\n").append(super.toString());
        if (!hasSatNav && !hasParkingSensors && !hasTowBar && !hasRoofRack) {
            result.append("\nNo additional options");
        } else {
            result.append("\nAdditional Options:");
            if (hasSatNav) result.append("\nSat Nav");
            if (hasParkingSensors) result.append("\nParking Sensors");
            if (hasTowBar) result.append("\nTow Bar");
            if (hasRoofRack) result.append("\nRoof Rack");
        }
        return result.toString();
    }
}
