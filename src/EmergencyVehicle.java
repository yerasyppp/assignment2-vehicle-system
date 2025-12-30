/**
 * Represents a specialized emergency vehicle.
 * Demonstrates Multi-level Inheritance: Vehicle -> Car -> EmergencyVehicle.
 */
public class EmergencyVehicle extends Car {
    private String department; // e.g., Police, Fire, Ambulance

    public EmergencyVehicle(String manufacturer, int releaseYear, int seatingCapacity, String department) {
        // Calls the Car constructor
        super(manufacturer, releaseYear, seatingCapacity, "Special Purpose");
        this.department = department;
    }

    @Override
    public void startEngine() {
        System.out.println(getManufacturer() + " (" + department + "): Emergency engine started. Radio is ON.");
    }

    /**
     * Unique method for emergency vehicles.
     */
    public void useSiren() {
        System.out.println("!!! ALERT !!! " + department + " is activating sirens and lights!");
    }
}