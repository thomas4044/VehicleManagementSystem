public class Motorbike extends Vehicle {
    private boolean hasLuggageBox = false;

    public Motorbike(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(id, make, model, year, gearboxType, colour, mileage, vin);
    }

    // Setters to add or remove luggage box.
    public void addLuggageBox() {
        this.hasLuggageBox = true;
    }
    public void removeLuggageBox() {
        this.hasLuggageBox = false;
    }

    @Override
    public String toString() {
        return "Motorbike: \n" + super.toString() + "\nHas luggage box:\t" + hasLuggageBox;
        }

    @Override
    public int compareTo(Vehicle o) {
        return 0;
    }
}

