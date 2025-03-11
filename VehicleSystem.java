class Vehicle {
    // Static variable to store the registration fee, shared by all vehicles
    private static double registrationFee = 500;

    // Final variable to store the registration number, which cannot be changed once assigned
    private final String registrationNumber;

    private String ownerName;
    private String vehicleType;

    // Constructor to initialize a vehicle with registration number, owner name, and vehicle type
    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    public void displayVehicleDetails() {
        if (this instanceof Vehicle) { // Checking if the current object is an instance of Vehicle
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: Rs." + registrationFee);
        }
    }
}

// Main class to test the Vehicle class
public class VehicleSystem {
    public static void main(String[] args) {
        // Creating vehicle objects with registration number, owner name, and vehicle type
        Vehicle vehicle1 = new Vehicle("HR49V456", "Ankush", "Bike");
        Vehicle vehicle2 = new Vehicle("HP23B123", "Aditya", "Car");

        // Displaying details of the first vehicle
        vehicle1.displayVehicleDetails();

        // Displaying details of the second vehicle
        vehicle2.displayVehicleDetails();
    }
}
