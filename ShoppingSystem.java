class Product {
    // Static variable
    private static double discount = 10.0; // Shared among all products

    // Instance Variables
    private final int productID; // Final Variable
    private String productName;
    private double price;
    private int quantity;

    // Constructor
    Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display product details
    public void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println();
        }
    }

    // Method to update discount
    public static void updateDiscount(double discount) {
        Product.discount = discount;
    }
}

public class ShoppingSystem {
    public static void main(String[] args) {
        // Create objects of product class
        Product p1 = new Product(101, "Laptop", 100000, 10);
        Product p2 = new Product(102, "Mobile", 50000, 20);

        // Display product details
        p1.displayDetails();
        p2.displayDetails();

        // Method to update discount percentage
        Product.updateDiscount(15);
        System.out.println("Discount percentage updated successfully");
    }
}
// Sample Output ->
//Product ID: 101
//Product Name: Laptop
//Price: 100000.0
//Quantity: 10
//Discount: 10.0%
//
//Product ID: 102
//Product Name: Mobile
//Price: 50000.0
//Quantity: 20
//Discount: 10.0%
//
//Discount percentage updated successfully