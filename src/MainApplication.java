import devtools.io.Data;
import devtools.ui.Application;
import devtools.ui.Menu;
import devtools.util.Reader;
import devtools.util.Sequence;

import java.util.ArrayList;
import java.util.List;

public class MainApplication {

        @Data
        public List<Vehicle> vehicles = new ArrayList<>();

        @Data
        public Sequence sequence = new Sequence(1, 1_000_000, "V");

    public static void main(String[] args) {

        Application.start(MainApplication.class);

    }

    @Menu(command = "A", description = "Add Vehicle", id = 0)
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
        Vehicle v = new Estate(id, make, model, year, gearboxType, colour, mileage, vin);
        vehicles.add(v);
        System.out.println("Vehicle added with ID: " + id);
    }
}
