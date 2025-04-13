public abstract class Car extends Vehicle {
    //private final BodyType bodyType;
    private boolean hasSatNav = false;
    private boolean hasParkingSensors = false;
    private boolean hasTowBar = false;
    private boolean hasRoofRack = false;
    private boolean hasThirdRowSeat = false;

    public Car(String make, String model, int year, GearboxType gearboxType, String colour, int mileage, String vin) {
        super(make, model, year, gearboxType, colour, mileage, vin);

    }


    /*
    // Switch method with cases for adding options by flipping boolean to true; throws error message if the wrong
    // option is selected based on the body type, or an invalid option is entered.
    public void addOption(String option) {
        switch (option.toLowerCase()) {
            case "satnav":
                this.hasSatNav = true;
                break;
            case "parkingsensors":
                this.hasParkingSensors = true;
                break;
            case "towbar":
                this.hasTowBar = true;
                break;
            case "roofrack":
                this.hasRoofRack = true;
                break;
            case "allwheeldrive":
                if (bodyType == BodyType.SUV) this.hasAllWheelDrive = true;
                else throw new IllegalArgumentException("All Wheel Drive is available only for SUVs.");
                break;
            case "thirdrowseat":
                if (bodyType == BodyType.ESTATE) this.hasThirdRowSeat = true;
                else throw new IllegalArgumentException("Third Row Seat is available only for Estate cars.");
                break;
            default:
                throw new IllegalArgumentException("Invalid option or input. Please enter an option as written above.");
        }
    }
    */
    @Override
    public String toString() {

        System.out.println("ADDITIONAL OPTIONS: ");
        if (!hasSatNav && !hasParkingSensors && !hasTowBar && !hasRoofRack && !hasThirdRowSeat) {
            System.out.println("NO ADDITIONAL OPTIONS");
        } else {
            if (hasSatNav) System.out.print("SATNAV");
            if (hasParkingSensors) System.out.print("\tPARKING SENSORS");
            if (hasTowBar) System.out.print("\tTOW BAR");
            if (hasRoofRack) System.out.print("\tROOF RACK");
            if (hasThirdRowSeat) System.out.print("\tTHIRD ROW SEAT");
            System.out.println();
        }
    }
}
