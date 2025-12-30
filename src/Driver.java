/**
 * Represents a vehicle driver.
 * Demonstrates the Association principle.
 */
public class Driver {
    private String name;
    private String licenseId;

    public Driver(String name, String licenseId) {
        this.name = name;
        this.licenseId = licenseId;
    }

    /**
     * Displays driver's personal information.
     */
    public void showDriverCard() {
        System.out.println("Driver: " + name + " | License ID: " + licenseId);
    }

    @Override
    public String toString() {
        return name;
    }
}