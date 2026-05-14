// ============================================================
// Task 10: Abstract Shape Class with Rectangle and Triangle
// ============================================================
// What this program does:
//   - "Shape" is an ABSTRACT class — it cannot be created directly
//   - Rectangle and Triangle extend Shape and implement calculateArea()
//   - Triangle uses Heron's Formula to calculate area
//   - Triangle checks if it's right-angled using Pythagorean theorem
// ============================================================

public class Main {
    public static void main(String[] args) {

        // Create a Rectangle with length=3 and width=5
        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());

        System.out.println(); // Empty line for spacing

        // Create a Triangle with sides 13, 7, 14
        Triangle triangle = new Triangle(13, 7, 14);

        // %.1f means: print a decimal number with 1 decimal place
        System.out.printf("Triangle Area: %.1f\n", triangle.calculateArea());
        triangle.checkRightAngled();
    }
}

// ============================================================
// Abstract Class: Shape
// ============================================================
abstract class Shape {

    // Abstract method
    public abstract double calculateArea();
}

// ============================================================
// Child Class: Rectangle
// ============================================================
class Rectangle extends Shape {

    double length;
    double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Area = length × width
    public double calculateArea() {
        return length * width;
    }
}

// ============================================================
// Child Class: Triangle
// ============================================================
class Triangle extends Shape {

    double a, b, c;

    // Constructor
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Heron's Formula
    public double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Check if triangle is right-angled
    public void checkRightAngled() {
        double x = a * a;
        double y = b * b;
        double z = c * c;

        if (x + y == z || x + z == y || y + z == x) {
            System.out.println("This Triangle is a right-angled Triangle.");
        } else {
            System.out.println("This Triangle is not a right-angled Triangle.");
        }
    }
}
