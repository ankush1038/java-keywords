class Product {
    private static double discount = 10.0;

    // Final variable to store the product ID, which cannot be changed once assigned
    private final int productID;

    private String productName;

    // Instance variable to store the product price
    private double price;

    private int quantity;

    // Constructor to initialize a product with ID, name, price, and quantity
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to display product details
    public void displayProductDetails() {
        if (this instanceof Product) { // Checking if the current object is an instance of Product
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }

    // Static method to update the discount for all products
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
}

// Main class to test the Product class
public class ShoppingCart {
    public static void main(String[] args) {
        // Creating product objects with ID, name, price, and quantity
        Product prod1 = new Product(101, "Laptop", 1200, 2);
        Product prod2 = new Product(102, "Smartphone", 800, 5);

        // Displaying details of the first product
        prod1.displayProductDetails();

        // Displaying details of the second product
        prod2.displayProductDetails();

        // Updating the discount for all products
        Product.updateDiscount(15);
        System.out.println("New Discount Updated!");
    }
}
