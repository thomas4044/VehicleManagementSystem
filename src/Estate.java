public class Estate extends Car{
    public Estate(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(id, make, model, year, gearboxType, colour, mileage, vin);
    }

    private boolean hasThirdRowSeat = false;

    // Setter to add third row seat.
    public void addThirdRowSeat() {
        this.hasThirdRowSeat = true;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("Estate Car:\n").append(super.toString());
        if (!hasSatNav && !hasParkingSensors && !hasTowBar && !hasRoofRack && !hasThirdRowSeat) {
            result.append("\nNo additional options");
        } else {
            result.append("\nAdditional Options:");
            if (hasSatNav) result.append("\nSat Nav");
            if (hasParkingSensors) result.append("\nParking Sensors");
            if (hasTowBar) result.append("\nTow Bar");
            if (hasRoofRack) result.append("\nRoof Rack");
            if (hasThirdRowSeat) result.append("\nThird Row Seat");
        }
        return result.toString();
    }
}
