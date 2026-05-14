// ============================================================
// Task 9: Beverage Hierarchy
// ============================================================
// What this program does:
//   - Parent class "Beverage" has name and price
//   - "Coffee" and "Soda" extend Beverage
//   - Coffee has an extra caffeine level field
//   - Soda has an extra diet status field
// ============================================================

public class Main {
    public static void main(String[] args) {

        // Create a Coffee
        Coffee coffee = new Coffee("Espresso", 3.5, 80);

        // Create a Soda
        Soda soda = new Soda("Coca-Cola", 1.99, false);

        // Display coffee info
        coffee.displayInfo();

        System.out.println(); // Empty line

        // Display soda info
        soda.displayInfo();
    }
}

// ============================================================
// Parent Class: Beverage
// ============================================================
class Beverage {

    String name;
    double price;

    // Constructor
    public Beverage(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Display beverage information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

// ============================================================
// Child Class: Coffee
// ============================================================
class Coffee extends Beverage {

    int caffeineLevel;

    // Constructor
    public Coffee(String name, double price, int caffeineLevel) {
        super(name, price);
        this.caffeineLevel = caffeineLevel;
    }

    // Display coffee information
    public void displayInfo() {
        System.out.println("Coffee Information:");
        super.displayInfo();
        System.out.println("Caffeine Level: " + caffeineLevel + " mg");
    }
}

// ============================================================
// Child Class: Soda
// ============================================================
class Soda extends Beverage {

    boolean isDiet;

    // Constructor
    public Soda(String name, double price, boolean isDiet) {
        super(name, price);
        this.isDiet = isDiet;
    }

    // Display soda information
    public void displayInfo() {
        System.out.println("Soda Information:");
        super.displayInfo();
        System.out.println("Diet: " + (isDiet ? "Yes" : "No"));
    }
}
