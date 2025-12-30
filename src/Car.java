/**
 * Represents a passenger car.
 * Inherits from Vehicle.
 */
public class Car extends Vehicle {
    private int seatingCapacity;
    private String bodyStyle;

    public Car(String manufacturer, int releaseYear, int seatingCapacity, String bodyStyle) {
        // Constructor chaining using super keyword
        super(manufacturer, releaseYear);
        this.seatingCapacity = seatingCapacity;
        this.bodyStyle = bodyStyle;
    }

    @Override
    public void startEngine() {
        System.out.println(getManufacturer() + ": Engine started. Systems check complete.");
    }

    @Override
    public void stopEngine() {
        System.out.println(getManufacturer() + ": Engine stopped. Powering down.");
    }
}