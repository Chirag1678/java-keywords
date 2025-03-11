class Patient {
    // Static Variables
    private static String hospitalName = "Neelam Hospital"; // Shared across all patients
    private static int totalPatients = 0; // Counter for total patients

    // Instance Variables
    private final int patientID; // Final variable (Unique ID for each patient)
    private String name;
    private int age;
    private String ailment;

    // Constructor
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Method to display patient details
    public void displayDetails() {
        if(this instanceof Patient) {
            System.out.println("Hospital Name: " + hospitalName);
            System.out.println("Patient ID: " + patientID);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println();
        }
    }

    // Method to display total number of patients
    public static void getTotalPatients() {
        System.out.print("Total Patients Admitted: " + totalPatients);
    }
}

// Main Class
public class HospitalSystem {
    public static void main(String[] args) {
        // Create Objects of Patient Class
        Patient patient1 = new Patient(1, "Aman", 20, "Fever");
        Patient patient2 = new Patient(2, "Chirag", 25, "Headache");

        // Display patient details
        patient1.displayDetails();
        patient2.displayDetails();

        // Display total number of patients
        Patient.getTotalPatients();
    }
}
// Sample Output ->
//Hospital Name: Neelam Hospital
//Patient ID: 1
//Name: Aman
//Age: 20
//Ailment: Fever
//
//Hospital Name: Neelam Hospital
//Patient ID: 2
//Name: Chirag
//Age: 25
//Ailment: Headache
//
//Total Patients Admitted: 2