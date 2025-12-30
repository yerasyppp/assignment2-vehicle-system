/**
 * Abstract base class for all vehicle types.
 * Demonstrates Abstraction and Encapsulation.
 */
public abstract class Vehicle {
    // Private fields for encapsulation
    private String manufacturer;
    private int releaseYear;

    // Protected field to allow access within the package and subclasses
    protected Driver activeDriver; // Aggregation

    public Vehicle(String manufacturer, int releaseYear) {
        // Basic data validation
        this.manufacturer = (manufacturer != null) ? manufacturer : "Unknown";
        this.releaseYear = (releaseYear > 1900) ? releaseYear : 2024;
    }

    /**
     * Assigns a driver to the vehicle (Aggregation).
     */
    public void assignDriver(Driver driver) {
        this.activeDriver = driver;
    }

    // Protected getters to provide read-only access to private fields for subclasses
    protected String getManufacturer() { return manufacturer; }
    protected int getReleaseYear() { return releaseYear; }

    // Abstract methods to be implemented by specific vehicle types
    public abstract void startEngine();
    public abstract void stopEngine();

    /**
     * Concrete method to display general vehicle information.
     */
    public void displayInfo() {
        System.out.println("Model: " + manufacturer + " [" + releaseYear + "]");
    }
}