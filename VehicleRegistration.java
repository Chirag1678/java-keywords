class Vehicle {
    // Static Variable
    private static double registrationFee = 500;

    // Instance Variables
    private final String registrationNumber; // Final variable
    private String ownerName;
    private String vehicleType;

    // Constructor
    Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Method to display vehicle details
    public void displayDetails() {
        if(this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: Rs." + registrationFee);
            System.out.println();
        }
    }
}

// Main Class
public class VehicleRegistration {
    public static void main(String[] args) {
        // Create Objects of Vehicle Class
        Vehicle veh1 = new Vehicle("123-ABC", "Aman", "Car");
        Vehicle veh2 = new Vehicle("456-DEF", "Chirag", "Bike");

        // Display vehicle details
        veh1.displayDetails();
        veh2.displayDetails();
    }
}
// Sample Output ->
//Registration Number: 123-ABC
//Owner Name: Aman
//Vehicle Type: Car
//Registration Fee: Rs.500.0
//
//Registration Number: 456-DEF
//Owner Name: Chirag
//Vehicle Type: Bike
//Registration Fee: Rs.500.0