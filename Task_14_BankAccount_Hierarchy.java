// ============================================================
// Task 14: Vehicle Inheritance
// ============================================================
// What this program does:
//   - Creates a parent class "Vehicle" with common properties
//   - Creates two child classes: "Car" and "Motorcycle"
//   - Each child class INHERITS (gets) properties from Vehicle
// ============================================================

public class Main {
    public static void main(String[] args) {

        // Create a Car object
        Car car = new Car("Toyota", 2002, 4);

        // Create a Motorcycle object
        Motorcycle motorcycle = new Motorcycle("Harley-Davidson", 2003, true);

        // Display car information
        car.displayInfo();

        System.out.println(); // Empty line for spacing

        // Display motorcycle information
        motorcycle.displayInfo();
    }
}

// ============================================================
// Parent Class: Vehicle
// Base class for Car and Motorcycle
// ============================================================
class Vehicle {

    // Common properties of all vehicles
    String makeBy;
    int makingYear;

    // Constructor
    public Vehicle(String makeBy, int makingYear) {
        this.makeBy = makeBy;
        this.makingYear = makingYear;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Make: " + makeBy);
        System.out.println("Year: " + makingYear);
    }
}

// ============================================================
// Child Class: Car
// Inherits from Vehicle
// ============================================================
class Car extends Vehicle {

    int numberOfDoors;

    // Constructor
    public Car(String makeBy, int makingYear, int numberOfDoors) {
        super(makeBy, makingYear);
        this.numberOfDoors = numberOfDoors;
    }

    // Override displayInfo()
    public void displayInfo() {
        System.out.println("Car Information:");
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

// ============================================================
// Child Class: Motorcycle
// Inherits from Vehicle
// ============================================================
class Motorcycle extends Vehicle {

    boolean hasSidecar;

    // Constructor
    public Motorcycle(String makeBy, int makingYear, boolean hasSidecar) {
        super(makeBy, makingYear);
        this.hasSidecar = hasSidecar;
    }

    // Override displayInfo()
    public void displayInfo() {
        System.out.println("Motorcycle Information:");
        super.displayInfo();
        System.out.println("Has sidecar: " + hasSidecar);
    }
}
