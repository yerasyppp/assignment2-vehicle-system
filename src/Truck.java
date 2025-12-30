/**
 * Represents a heavy truck.
 * Inherits from Vehicle.
 */
public class Truck extends Vehicle {
    private double maxPayload;
    private int axles;

    public Truck(String manufacturer, int releaseYear, double maxPayload, int axles) {
        super(manufacturer, releaseYear);
        this.maxPayload = maxPayload;
        this.axles = axles;
    }

    @Override
    public void startEngine() {
        System.out.println(getManufacturer() + ": Diesel engine warming up. Air pressure stable.");
    }

    @Override
    public void stopEngine() {
        System.out.println(getManufacturer() + ": Truck engine shut down. Parking brake engaged.");
    }
}