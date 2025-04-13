
// Class is abstract as only Car or Motorbike objects should be created. Properties which should not be changed are final.
public abstract class Vehicle {
    private final String make;
    private final String model;
    private final int year;
    private final GearboxType gearboxType;
    private String colour;
    private int mileage;
    private final String vin;

    public Vehicle(String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.gearboxType = gearboxType;
        this.colour = colour;
        this.mileage = mileage;
        this.vin = vin;

    }

    // Getters for vehicle properties
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public GearboxType getGearboxType() {
        return gearboxType;
    }
    public String getColour() {
        return colour;
    }
    public int getMileage() {
        return mileage;
    }
    public String getVin() {
        return vin;
    }

    // Setters for changeable properties
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // Abstract method for printing details - can be called by any vehicle but functions differently depending on
    // whether the vehicle is a car or motorbike.
    @Override
    public String toString() {
        return "MAKE:\t" + make.toUpperCase() + "\nMODEL:\t" + model.toUpperCase() + "\nYEAR:\t"
                + year + "\nVIN:\t" + vin.toUpperCase() + "\nGEARBOX TYPE:\t" + gearboxType
                + "\nCOLOUR:\t" + colour.toUpperCase() + "\nMILEAGE:\t" + mileage;
    }

}
