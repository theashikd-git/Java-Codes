// ============================================================
// Task 3 (OOP Basics): Product Class
// ============================================================
// What this program does:
//   - Defines a "Product" class with name, price, and category
//   - Creates two Product objects (a Laptop and a Notebook)
//   - Displays each product's information using print()
// ============================================================

// Define the Product class
class Product {

    // Fields: every product has a name, price, and category
    String name;      // Product name (e.g., "Laptop")
    double price;     // Product price (double supports decimal values)
    String category;  // Product category (e.g., "Electronics")

    // Constructor: creates a Product with all three fields set
    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Method: display all info for this product
    void print() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Category: " + category);
        System.out.println(); // Blank line after each product
    }
}

// ============================================================
// Main class
// ============================================================
public class Main {
    public static void main(String[] args) {

        // Create Product p1: a Laptop costing 75,000 in Electronics category
        Product p1 = new Product("Laptop", 75000, "Electronics");

        // Create Product p2: a Notebook costing 50 in Stationery category
        Product p2 = new Product("Notebook", 50, "Stationery");

        // Print details of both products
        p1.print();
        p2.print();
    }
}
