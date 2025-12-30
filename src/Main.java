/**
 * Main entry point of the program.
 * Demonstrates Polymorphism and Array processing.
 */
public class Main {
    public static void main(String[] args) {
        // Create an array of Vehicle objects (Polymorphism)
        Vehicle[] fleet = new Vehicle[4];

        // Initialize different types of vehicles
        fleet[0] = new Car("Toyota Camry 70", 2021, 5, "Sedan");
        fleet[1] = new Motorcycle("Yamaha R1", 2022, true);
        fleet[2] = new Truck("KamAZ 5490", 2020, 20.0, 3);
        fleet[3] = new EmergencyVehicle("Hyundai Elantra", 2023, 5, "POLICE (Qazaqstan)");

        // Create driver objects
        Driver d1 = new Driver("Bauyrzhan Almatov", "KZ-777-01");
        Driver d2 = new Driver("Arman Saparov", "KZ-001-02");

        // Assign drivers to vehicles (Aggregation)
        fleet[0].assignDriver(d1);
        fleet[1].assignDriver(d1);
        fleet[2].assignDriver(d2);
        fleet[3].assignDriver(d2);

        System.out.println("=== VEHICLE MANAGEMENT SYSTEM REPORT ===\n");

        // Process each vehicle in the array using a loop
        for (Vehicle v : fleet) {
            v.displayInfo();
            v.startEngine();

            // Safe handling of null references for drivers
            if (v.activeDriver != null) {
                v.activeDriver.showDriverCard();
            }

            // Demonstrate Downcasting for the bonus class
            if (v instanceof EmergencyVehicle) {
                ((EmergencyVehicle) v).useSiren();
            }

            v.stopEngine();
            System.out.println("---------------------------------------");
        }
    }
}