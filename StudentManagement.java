class Student {
    // Static Variable
    private static String universityName = "Chitkara University";

    // Instance Variables
    private final int rollNumber; // Final variable
    private String name;
    private String grade;

    // Constructor
    Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University Name: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println();
        }
    }
}

// Main Class
public class StudentManagement {
    public static void main(String[] args) {
        // Create Objects of Student Class
        Student stud1 = new Student(101, "Aman", "A");
        Student stud2 = new Student(102, "Chirag", "B");

        // Display student details
        stud1.displayDetails();
        stud2.displayDetails();
    }
}
// Sample Output ->
//University Name: Chitkara University
//Roll Number: 101
//Name: Aman
//Grade: A
//
//University Name: Chitkara University
//Roll Number: 102
//Name: Chirag
//Grade: B