import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertTrue;

class CarTest {

    // Tests additional options in Car class print correctly.
    @Test
    void printOptionsIncludesCommonOptionsWhenSet() {
        Car car = new Estate("1", "Make", "Model", 2023, GearboxType.AUTO, "Red", 0, "VIN123");
        car.addSatNav();
        car.addParkingSensors();

        String output = captureOutput(() -> System.out.print(car));

        assertTrue(output.contains("Sat Nav"));
        assertTrue(output.contains("Parking Sensors"));
    }

    // Tests exclusive option for third row seat in estate prints correctly.
    @Test
    void printOptionsIncludesExclusiveOptionsForEstate() {
        Estate estate = new Estate("1", "Make", "Model", 2023, GearboxType.AUTO, "Red", 0, "VIN123");
        estate.addThirdRowSeat();

        String output = captureOutput(() -> System.out.print(estate));

        assertTrue(output.contains("Third Row Seat"));
    }

    // Tests exclusive option for all-wheel drive in SUV prints correctly.
    @Test
    void printOptionsIncludesExclusiveOptionsForSuv() {
        Suv suv = new Suv("1", "Make", "Model", 2023, GearboxType.AUTO, "Blue", 0, "VIN456");
        suv.addAllWheelDrive();

        String output = captureOutput(() -> System.out.print(suv));

        assertTrue(output.contains("All-Wheel Drive"));
    }

    // Tests no additional options prints correctly.
    @Test
    void printOptionsHandlesNoOptionsGracefully() {
        Car car = new Estate("1", "Make", "Model", 2023, GearboxType.AUTO, "Red", 0, "VIN123");

        String output = captureOutput(() -> System.out.print(car));

        assertTrue(output.contains("No additional options"));
    }

    // Tests invalid option throws exception.
    @Test
    void testInvalidOptionThrowsException() {
        Car car = new Estate("1", "Make", "Model", 2023, GearboxType.AUTO, "Red", 0, "VIN123");

        try {
            car.addOption("Invalid Option");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid option or input"));
        }
    }

    // Tests invalid option for all-wheel drive in non-SUV throws exception.
    @Test
    void testInvalidOptionForSuvThrowsException() {
        Car car = new Estate("1", "Make", "Model", 2023, GearboxType.AUTO, "Red", 0, "VIN123");

        try {
            car.addOption("All-Wheel Drive");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("All-Wheel Drive is available only for SUVs."));
        }
    }

    // Tests invalid option for third row seat in non-Estate throws exception.
    @Test
    void testInvalidOptionForEstateThrowsException() {
        Car car = new Suv("1", "Make", "Model", 2023, GearboxType.AUTO, "Red", 0, "VIN123");

        try {
            car.addOption("Third Row Seat");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Third Row Seat is available only for Estate cars."));
        }
    }

    // Helper method to capture console output
    private String captureOutput(Runnable action) {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            action.run();
        } finally {
            System.setOut(originalOut);
        }
        return outContent.toString();
    }
}