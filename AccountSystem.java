class BankAccount {
    // Static variables -> shared among all instances/objects
    private static String bankName = "Central Bank";
    private static int totalAccounts = 0;

    // Instance Variables
    private final int accountNumber; // Final variable that can't be changed once assigned
    private String accountHolder;
    private double balance;

    // Constructor
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        totalAccounts++; // Increment the number of accounts
    }

    // Method to display account details
    public void displayDetails() {
        if(this instanceof BankAccount) { // instanceOf operator
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Balance: " + balance);
            System.out.println();
        }
    }

    // Method to display total accounts
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }
}

// Main Class
public class AccountSystem {
    public static void main(String[] args) {
        // Create objects of BankAccount class
        BankAccount acc1 = new BankAccount(101, "Aman", 500000);
        BankAccount acc2 = new BankAccount(102, "Adarsh", 300000);

        // Display account details
        acc1.displayDetails();
        acc2.displayDetails();

        // Get total number of bank accounts
        BankAccount.getTotalAccounts();
    }
}
// Sample Ouptut ->
//Bank Name: Central Bank
//Account Number: 101
//Account Holder: Aman
//Balance: 500000.0
//
//Bank Name: Central Bank
//Account Number: 102
//Account Holder: Adarsh
//Balance: 300000.0
//
//Total Accounts: 2