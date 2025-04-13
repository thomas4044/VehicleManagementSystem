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
        return "Estate Car:\n" + super.toString() +
                getAdditionalOptionsString(hasThirdRowSeat);
    }
}
