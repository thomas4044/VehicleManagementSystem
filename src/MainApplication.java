import devtools.io.Data;
import devtools.ui.Application;
import devtools.ui.Menu;
import devtools.util.CollectionUtils;
import devtools.util.Reader;
import devtools.util.Sequence;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class MainApplication {

    @Data
    public List<Vehicle> vehicles = new ArrayList<>();

    @Data
    public List<Vehicle> soldVehicles = new ArrayList<>();

    @Data
    public Sequence sequence = new Sequence(1, 1_000_000, "V");

    public static void main(String[] ignoredArgs) {

        System.out.println("Welcome to the Vehicle Management System!");
        System.out.println("Please see ReadMe.txt for instructions on how to use the program.");
        Application.start(MainApplication.class);

    }

    @SuppressWarnings("ReassignedVariable")
    @Menu(command = "A", description = "Add Vehicle", id = 0, index = -2, subMenuIDs = {1, 2, 3, 4, 5})
    @Menu(command = "E", description = "Add Estate", id = 1)
    public void addEstate() {
        String make = Reader.readLine("Enter vehicle make: ");
        String model = Reader.readLine("Enter vehicle model: ");
        int year = Reader.readInt("Enter vehicle year: ", 1900, 2025);
        String colour = Reader.readObject("Select vehicle colour: ", "Red", "Blue", "Green", "Black",
                "White", "Yellow");
        int mileage = Reader.readInt("Enter vehicle mileage: ", 0, 1_000_000);
        String vin = Reader.readLine("Enter vehicle vin: ");
        GearboxType gearboxType = Reader.readEnum("Please select gearbox type: ", GearboxType.class);
        String id = sequence.next();
        Estate e = new Estate(id, make, model, year, gearboxType, colour, mileage, vin);
        vehicles.add(e);
        String addOptions = Reader.readObject("Does the vehicle have additional options?", "Yes", "No");
        if (addOptions.equals("Yes")) {
            boolean success = false;
            while (!success) {
                try {
                    do addOption(e);
                    while (Reader.readBoolean("Add another option? (Y/N)"));
                    success = true;
                } catch (IllegalArgumentException error) {
                    System.out.println(error.getMessage());
                    Reader.readLine("Press Enter to try again...");
                }
            }
        }
        System.out.println("Vehicle added with ID: " + id);
    }

    @Menu(command = "H", description = "Add Hatchback", id = 2)
    public void addHatchback() {
        String make = Reader.readLine("Enter vehicle make: ");
        String model = Reader.readLine("Enter vehicle model: ");
        int year = Reader.readInt("Enter vehicle year: ", 1900, 2025);
        String colour = Reader.readObject("Select vehicle colour: ", "Red", "Blue", "Green", "Black",
                "White", "Yellow");
        int mileage = Reader.readInt("Enter vehicle mileage: ", 0, 1_000_000);
        String vin = Reader.readLine("Enter vehicle vin: ");
        GearboxType gearboxType = Reader.readEnum("Please select gearbox type: ", GearboxType.class);
        String id = sequence.next();
        Hatchback v = new Hatchback(id, make, model, year, gearboxType, colour, mileage, vin);
        vehicles.add(v);
        String addOptions = Reader.readObject("Does the vehicle have additional options?", "Yes", "No");
        if (addOptions.equals("Yes")) {
            boolean success = false;
            while (!success) {
                try {
                    do addOption(v);
                    while (Reader.readBoolean("Add another option? (Y/N)"));
                    success = true;
                } catch (IllegalArgumentException error) {
                    System.out.println(error.getMessage());
                    Reader.readLine("Press Enter to try again...");
                }
            }
        }
        System.out.println("Vehicle added with ID: " + id);
    }

    @Menu(command = "SA", description = "Add Saloon", id = 3)
    public void addSaloon() {
        String make = Reader.readLine("Enter vehicle make: ");
        String model = Reader.readLine("Enter vehicle model: ");
        int year = Reader.readInt("Enter vehicle year: ", 1900, 2025);
        String colour = Reader.readObject("Select vehicle colour: ", "Red", "Blue", "Green", "Black",
                "White", "Yellow");
        int mileage = Reader.readInt("Enter vehicle mileage: ", 0, 1_000_000);
        String vin = Reader.readLine("Enter vehicle vin: ");
        GearboxType gearboxType = Reader.readEnum("Please select gearbox type: ", GearboxType.class);
        String id = sequence.next();
        Saloon v = new Saloon(id, make, model, year, gearboxType, colour, mileage, vin);
        vehicles.add(v);
        String addOptions = Reader.readObject("Does the vehicle have additional options?", "Yes", "No");
        if (addOptions.equals("Yes")) {
            boolean success = false;
            while (!success) {
                try {
                    do addOption(v);
                    while (Reader.readBoolean("Add another option? (Y/N)"));
                    success = true;
                } catch (IllegalArgumentException error) {
                    System.out.println(error.getMessage());
                    Reader.readLine("Press Enter to try again...");
                }
            }
        }
        System.out.println("Vehicle added with ID: " + id);
    }

    @Menu(command = "SU", description = "Add SUV", id = 4)
    public void addSuv() {
        String make = Reader.readLine("Enter vehicle make: ");
        String model = Reader.readLine("Enter vehicle model: ");
        int year = Reader.readInt("Enter vehicle year: ", 1900, 2025);
        String colour = Reader.readObject("Select vehicle colour: ", "Red", "Blue", "Green", "Black",
                "White", "Yellow");
        int mileage = Reader.readInt("Enter vehicle mileage: ", 0, 1_000_000);
        String vin = Reader.readLine("Enter vehicle vin: ");
        GearboxType gearboxType = Reader.readEnum("Please select gearbox type: ", GearboxType.class);
        String id = sequence.next();
        Suv v = new Suv(id, make, model, year, gearboxType, colour, mileage, vin);
        vehicles.add(v);
        String addOptions = Reader.readObject("Does the vehicle have additional options?", "Yes", "No");
        if (addOptions.equals("Yes")) {
            boolean success = false;
            while (!success) {
                try {
                    do addOption(v);
                    while (Reader.readBoolean("Add another option? (Y/N)"));
                    success = true;
                } catch (IllegalArgumentException error) {
                    System.out.println(error.getMessage());
                    Reader.readLine("Press Enter to try again...");
                }
            }
        }
        System.out.println("Vehicle added with ID: " + id);
    }

    @Menu(command = "M", description = "Add Motorbike", id = 5)
    public void addMotorbike() {
        String make = Reader.readLine("Enter vehicle make: ");
        String model = Reader.readLine("Enter vehicle model: ");
        int year = Reader.readInt("Enter vehicle year: ", 1900, 2025);
        String colour = Reader.readObject("Select vehicle colour: ", "Red", "Blue", "Green", "Black",
                "White", "Yellow");
        int mileage = Reader.readInt("Enter vehicle mileage: ", 0, 1_000_000);
        String vin = Reader.readLine("Enter vehicle vin: ");
        GearboxType gearboxType = Reader.readEnum("Please select gearbox type: ", GearboxType.class);
        String id = sequence.next();
        Motorbike v = new Motorbike(id, make, model, year, gearboxType, colour, mileage, vin);
        vehicles.add(v);
        String addLuggageBox = Reader.readObject("Does the motorbike have a luggage box?", "Yes", "No");
        if (addLuggageBox.equals("Yes")) {
            v.addLuggageBox();
            System.out.println("Luggage box added.");
        }
        System.out.println("Vehicle added with ID: " + id);
    }

    @Menu(command = "L", description = "List all vehicles", id = 6, index = 1)
    public void listVehicles() {
        Collections.sort(vehicles);
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
    }

    private Vehicle search(List<Vehicle> list) {
        String key = Reader.readLine("Enter a search key: ");
        Collection<Vehicle> search = CollectionUtils.search(key, list);
        return Reader.readObject("Choose a vehicle", search);
    }

    @Menu(command = "S", description = "Search for a vehicle", id = 7, index = -1, global = true)
    public void searchAndDisplay() {
        Vehicle v = search(vehicles); // May be null
        if (v != null) {
            System.out.println(v);
        } else {
            System.out.println("No vehicle was found!");
        }
    }

    public static void addOption(Car car) {
        String option = Reader.readObject("Select an Option", "Sat Nav", "Parking Sensors", "Tow Bar", "Roof Rack",
                "All-Wheel Drive", "Third Row Seat", "Go Back");
        if (option.equals("Go Back")) {
            System.out.println("Trying again...");
        } else {
            car.addOption(option);
            System.out.println("Option added: " + option);
        }
    }

    @Menu(command = "M", description = "Modify vehicle entries", id = 8, subMenuIDs = {9, 10, 11, 12})
    @Menu(command = "O", description = "Add car options", id = 9)
    public void addOptions() {
        Car v = (Car) search(vehicles);
        if (v != null) try {
            do addOption(v);
            while (Reader.readBoolean("Add another option? (Y/N)"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        else {
            System.out.println("No car found to modify.");
        }
    }

    @Menu(command = "LR", description = "Add/remove motorbike luggage rack", id = 10)
    public void addRemoveLuggageRack() {
        Motorbike v = (Motorbike) search(vehicles);
        if (v != null && !v.hasLuggageBox) {
            String option = Reader.readObject("Add luggage rack?", "Yes", "No");
            if (option.equals("Yes")) {
                v.addLuggageBox();
                System.out.println("Luggage box added.");
            } else {
                System.out.println("Luggage box not added.");
            }
        } else if (v != null) {
            String option = Reader.readObject("Remove luggage rack?", "Yes", "No");
            if (option.equals("Yes")) {
                v.removeLuggageBox();
                System.out.println("Luggage box removed.");
            } else {
                System.out.println("Luggage box not removed.");
            }
        } else {
            System.out.println("No motorbike found to modify.");
        }
    }

    @Menu(command = "C", description = "Change vehicle colour", id = 11)
    public void changeColour() {
        Vehicle v = search(vehicles);
        if (v != null) {
            String newColour = Reader.readObject("Select vehicle colour: ", "Red", "Blue", "Green", "Black",
                    "White", "Yellow");
            v.setColour(newColour);
            System.out.println("Vehicle colour updated to: " + newColour);
        } else {
            System.out.println("No vehicle found to modify.");
        }
    }

    @Menu(command = "M", description = "Change vehicle mileage", id = 12)
    public void changeMileage() {
        Vehicle v = search(vehicles);
        if (v != null) {
            int currentMileage = v.getMileage();
            System.out.println("Current mileage: " + currentMileage);
            int newMileage = Reader.readInt("Enter updated vehicle mileage: ",
                    currentMileage, 1_000_000);        // Mileage cannot decrease
            v.setMileage(newMileage);
            System.out.println("Vehicle colour updated to: " + newMileage);
        } else {
            System.out.println("No vehicle found to modify.");
        }
    }

    @Menu(command = "D", description = "Delete vehicle entry", id = 13, index = 3)
    public void deleteVehicle() {
        Vehicle v = search(vehicles);
        if (v != null) {
            String selection = Reader.readObject("Selected vehicle: "+ v
                    + "\nAre you sure you want to delete this vehicle? This cannot be undone!", "Yes", "No");
            if (selection.equals("Yes")) {
                System.out.println("Deleting vehicle...");
                vehicles.remove(v);
            } else {
                System.out.println("Deletion cancelled.");
                return;
            }
            System.out.println("Vehicle deleted successfully.");
        } else {
            System.out.println("No vehicle found to delete.");
        }
    }

    @Menu(command = "VA", description = "Vehicle archive", id = 14, subMenuIDs = {15, 16, 17})
    @Menu(command = "A", description = "Archive sold vehicle", id = 15, index = -2)
    public void archiveSoldVehicle() {
        Vehicle v = search(vehicles);
        if (v != null) {
            String selection = Reader.readObject("Selected vehicle: "+ v
                    + "Are you sure you want to archive this vehicle? This cannot be undone!", "Yes", "No");
            if (selection.equals("Yes")) {
                soldVehicles.add(v);
                vehicles.remove(v);
                System.out.println("Vehicle archived successfully.");
            } else {
                System.out.println("Archiving cancelled.");
            }
        } else {
            System.out.println("No vehicle found to archive.");
        }
    }

    @Menu(command = "LA", description = "List archived vehicles", id = 16, index = -1)
    public void listArchivedVehicles() {
        Collections.sort(soldVehicles);
        for (Vehicle v : soldVehicles) {
            System.out.println(v);
        }
    }

    @Menu(command = "SA", description = "Search archived vehicles", id = 17)
    public void searchArchivedVehicles() {
        Vehicle v = search(soldVehicles);
        if (v != null) {
            System.out.println(v);
        } else {
            System.out.println("No vehicle was found!");
        }
    }

}

