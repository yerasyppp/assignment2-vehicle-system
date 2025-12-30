/**
 * Represents a motorcycle.
 * Inherits from Vehicle.
 */
public class Motorcycle extends Vehicle {
    private boolean hasFairing;

    public Motorcycle(String manufacturer, int releaseYear, boolean hasFairing) {
        super(manufacturer, releaseYear);
        this.hasFairing = hasFairing;
    }

    @Override
    public void startEngine() {
        System.out.println(getManufacturer() + ": Motorcycle engine roars to life!");
    }

    @Override
    public void stopEngine() {
        System.out.println(getManufacturer() + ": Ignition off. Motorcycle parked.");
    }
}