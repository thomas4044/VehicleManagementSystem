// Class is abstract as each car type is now its own class
public abstract class Car extends Vehicle {

    protected boolean hasSatNav = false;
    protected boolean hasParkingSensors = false;
    protected boolean hasTowBar = false;
    protected boolean hasRoofRack = false;

    public Car(String id, String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(id, make, model, year, gearboxType, colour, mileage, vin);

    }

    public void addSatNav() {
        this.hasSatNav = true;
    }

    public void addParkingSensors() {
        this.hasParkingSensors = true;
    }

    public void addTowBar() {
        this.hasTowBar = true;
    }

    public void addRoofRack() {
        this.hasRoofRack = true;
    }

    // Switch method with cases for adding options by flipping boolean to true; throws error message if the wrong
    // option is selected based on the body type, or an invalid option is entered.
    public void addOption(String option) {
        switch (option) {
            case "Sat Nav":
                this.addSatNav();
                break;
            case "Parking Sensors":
                this.addParkingSensors();
                break;
            case "Tow Bar":
                this.addTowBar();
                break;
            case "Roof Rack":
                this.addRoofRack();
                break;
            case "All-Wheel Drive":
                if (this instanceof Suv)
                    ((Suv) this).addAllWheelDrive();
                else
                    throw new IllegalArgumentException("All-Wheel Drive is available only for SUVs.");
                break;
            case "Third Row Seat":
                if (this instanceof Estate)
                    ((Estate) this).addThirdRowSeat();
                else
                    throw new IllegalArgumentException("Third Row Seat is available only for Estate cars.");
                break;
            case "Exit":
                System.out.println("Exiting...");
                break;
            default:
                throw new IllegalArgumentException("Invalid option or input. Please enter an option as written above.");
        }
    }

    protected String getAdditionalOptions() {
        StringBuilder result = new StringBuilder();
        if (!hasSatNav && !hasParkingSensors && !hasTowBar && !hasRoofRack
                && !(this instanceof Suv && ((Suv) this).hasAllWheelDrive)
                && !(this instanceof Estate && ((Estate) this).hasThirdRowSeat)) {
            result.append("\nNo additional options");
        } else {
            result.append("\nAdditional Options:");
            if (hasSatNav) result.append("\nSat Nav");
            if (hasParkingSensors) result.append("\nParking Sensors");
            if (hasTowBar) result.append("\nTow Bar");
            if (hasRoofRack) result.append("\nRoof Rack");
            if (this instanceof Suv && ((Suv) this).hasAllWheelDrive) {
                result.append("\nAll-Wheel Drive");
            }
            if (this instanceof Estate && ((Estate) this).hasThirdRowSeat) {
                result.append("\nThird Row Seat");
            }
        }
        return result.toString();
    }
}

