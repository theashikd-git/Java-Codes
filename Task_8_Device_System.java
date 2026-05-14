// ============================================================
// Task 8: Device Hierarchy
// ============================================================
// What this program does:
//   - Parent class "Device" has brand and totalUnit
//   - "Phone" and "Laptop" extend Device
//   - Phone has an extra "operatingSystem" field
//   - Laptop has an extra "screenSize" field
// ============================================================

public class Main {
    public static void main(String[] args) {

        // Create a Phone
        Phone phone = new Phone("Apple", 150, "iOS");

        // Create a Laptop
        Laptop laptop = new Laptop("Dell", 125, 15.6);

        // Display phone info
        phone.displayInfo();

        System.out.println(); // Empty line

        // Display laptop info
        laptop.displayInfo();
    }
}

// ============================================================
// Parent Class: Device
// ============================================================
class Device {

    String brand;
    int totalUnit;

    // Constructor
    public Device(String brand, int totalUnit) {
        this.brand = brand;
        this.totalUnit = totalUnit;
    }

    // Display basic device info
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Total Unit: " + totalUnit);
    }
}

// ============================================================
// Child Class: Phone
// ============================================================
class Phone extends Device {

    String operatingSystem;

    // Constructor
    public Phone(String brand, int totalUnit, String operatingSystem) {
        super(brand, totalUnit);
        this.operatingSystem = operatingSystem;
    }

    // Display phone info
    public void displayInfo() {
        System.out.println("Phone Information:");
        super.displayInfo();
        System.out.println("Operating System: " + operatingSystem);
    }
}

// ============================================================
// Child Class: Laptop
// ============================================================
class Laptop extends Device {

    double screenSize;

    // Constructor
    public Laptop(String brand, int totalUnit, double screenSize) {
        super(brand, totalUnit);
        this.screenSize = screenSize;
    }

    // Display laptop info
    public void displayInfo() {
        System.out.println("Laptop Information:");
        super.displayInfo();
        System.out.println("Screen Size: " + screenSize + " inches");
    }
}
