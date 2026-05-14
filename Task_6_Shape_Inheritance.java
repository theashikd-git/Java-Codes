// ============================================================
// Task 6 (Inheritance): Shape → Circle, Rectangle 
// ============================================================
// What this program does:
//   - Parent class "Shape" has a displayType() method
//   - "Circle" and "Rectangle" override displayType()
//   - Each class stores its own specific measurements
//
// Key Concept: Method OVERRIDING
//   Child classes replace the parent's method with their own version
//   Java always calls the most specific version (the child's)
// ============================================================

public class ShapeHierarchy {
    public static void main(String[] args) {

        // Create a Circle with radius = 5.0
        Circle circle = new Circle(5.0);

        // Create a Rectangle with length = 4.0 and width = 6.0
        Rectangle rectangle = new Rectangle(4.0, 6.0);

        // Calling displayType() on each — each prints its own type
        circle.displayType();    // → "Type of shape: Circle"
        rectangle.displayType(); // → "Type of shape: Rectangle"
    }
}

// ============================================================
// Parent Class: Shape
// ============================================================
// Note: Comments already exist in the original file, kept and enhanced here
class Shape {

    // Default displayType — will be overridden by child classes
    public void displayType() {
        System.out.println("Type of shape: Shape");
    }
}

// ============================================================
// Child Class: Circle
// Inherits from Shape, adds its own radius field
// ============================================================
class Circle extends Shape {

    double radius; // The radius of this circle

    // Constructor: set the radius value
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override displayType() to identify as a Circle
    public void displayType() {
        System.out.println("Type of shape: Circle");
    }
}

// ============================================================
// Child Class: Rectangle
// Inherits from Shape, adds length and width fields
// ============================================================
class Rectangle extends Shape {

    double length; // Length of the rectangle
    double width;  // Width of the rectangle

    // Constructor: set both length and width
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Override displayType() to identify as a Rectangle
    public void displayType() {
        System.out.println("Type of shape: Rectangle");
    }
}
