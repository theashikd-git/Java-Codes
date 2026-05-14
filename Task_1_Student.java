// ============================================================
// Task 1 (OOP Basics): Student Class
// ============================================================
// What this program does:
//   - Defines a "Student" class with name, age, and grade
//   - Creates two Student objects with different data
//   - Calls print() on each to display their information
//
// Key Concept: CLASS = a blueprint; OBJECT = a real instance of it
//   Think of a class like a cookie cutter, and an object as the cookie!
// ============================================================

// Define the Student class (blueprint)
class Student {

    // Instance variables (fields) — every Student object has these
    String name;  // Student's name
    int age;      // Student's age
    String grade; // Student's grade (e.g., "A", "B+")

    // Constructor: runs when you create a new Student object
    // Parameters have the same names as fields, so we use "this." to tell them apart
    Student(String name, int age, String grade) {
        this.name = name;   // "this.name" = field; "name" = parameter
        this.age = age;
        this.grade = grade;
    }

    // Method to display this student's information
    void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println(); // Empty line after each student
    }
}

// ============================================================
// Main class: Entry point of the program
// ============================================================
public class Main {
    public static void main(String[] args) {

        // Create Student object s1: name="Ashik", age=22, grade="A"
        // "new Student(...)" calls the constructor above
        Student s1 = new Student("Ashik", 22, "A");

        // Create Student object s2: name="Rahim", age=21, grade="B+"
        Student s2 = new Student("Rahim", 21, "B+");

        // Call print() on each student to display their info
        s1.print();
        s2.print();
    }
}
