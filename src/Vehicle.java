import java.io.Serializable;

// Class is abstract as only Car or Motorbike objects should be created. Properties which should not be changed are final.
public abstract class Vehicle implements Serializable, Comparable<Vehicle> {
    private final String id;
    private final String make;
    private final String model;
    private final int year;
    private final GearboxType gearboxType;
    private String colour;
    private int mileage;
    private final String vin;

    public Vehicle(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.gearboxType = gearboxType;
        this.colour = colour;
        this.mileage = mileage;
        this.vin = vin;
    }

    // Getters for vehicle properties
    public String getId() {
        return id;
    }
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

    @Override
    public int compareTo(Vehicle other) {
        // Vehicles are compared by type (class name) first, to order them by vehicle type. Then they are sorted by VIN
        // (which is unique for each vehicle), make, model and entry ID.
        int compare = this.getClass().getName().compareTo(other.getClass().getName());
        if (compare != 0) {
            return compare;
        }
        compare = this.vin.compareTo(other.vin);
        if (compare != 0) {
            return compare;
        }
        compare = this.make.compareTo(other.make);
        if (compare != 0) {
            return compare;
        }
        compare = this.model.compareTo(other.model);
        if (compare != 0) {
            return compare;
        }
        return this.id.compareTo(other.id);
    }

    @Override
    public String toString() {
        return "\nMake:\t" + getMake() + "\nModel:\t" + getModel() + "\nYear:\t"
                + getYear() + "\nVIN:\t" + getVin() + "\nGearbox Type:\t" + getGearboxType()
                + "\nColour:\t" + getColour() + "\nMileage:\t" + getMileage();
    }

}
