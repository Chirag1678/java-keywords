class Employee {
    // Static Variables
    private static String companyName = "ABC Company";
    private static int totalEmployees = 0; // counter

    // Instance Variables
    private final int id;
    private String name;
    private String designation;

    // Constructor
    Employee(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        totalEmployees++;
    }

    // Method to display employee details
    public  void displayDetails() {
        if(this instanceof Employee) { // Using instanceof
            System.out.println("Company Name: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Employee Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println();
        }
    }

    // Method to display total employees
    public static void getTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

// Main Class
public class EmployeeSystem {
    public static void main(String[] args) {
        // Create Objects of Employee Class
        Employee emp1 = new Employee(1, "Aman", "Software Engineer");
        Employee emp2 = new Employee(2, "Adarsh", "Manager");

        // Display employee details
        emp1.displayDetails();
        emp2.displayDetails();

        // Display total number of employees
        Employee.getTotalEmployees();
    }
}
// Sample Output ->
//Company Name: ABC Company
//Employee ID: 1
//Employee Name: Aman
//Designation: Software Engineer
//
//Company Name: ABC Company
//Employee ID: 2
//Employee Name: Adarsh
//Designation: Manager
//
//Total Employees: 2