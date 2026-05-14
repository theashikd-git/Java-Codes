// ============================================================
// Task 7 (Inheritance): Employee → Manager, Developer 
// ============================================================
// What this program does:
//   - Parent class "Employee" has a name and displayInfo()
//   - "Manager" adds a "department" field
//   - "Developer" adds a "programmingLanguage" field
//   - Each child overrides displayInfo() with extra details
// ============================================================

public class EmployeeHierarchy {
    public static void main(String[] args) {

        // Create a Manager: name="Alice", department="HR"
        Manager manager = new Manager("Alice", "HR");

        // Create a Developer: name="Bob", language="Java"
        Developer developer = new Developer("Bob", "Java");

        // Display each employee's info
        manager.displayInfo();   // Shows name + department
        developer.displayInfo(); // Shows name + programming language
    }
}

// ============================================================
// Parent Class: Employee
// ============================================================
class Employee {

    String name; // Employee's name

    // Constructor: set the employee's name
    public Employee(String name) {
        this.name = name;
    }

    // Base displayInfo() — only shows name
    // Child classes will override this with more details
    public void displayInfo() {
        System.out.println("Name: " + name);
    }
}

// ============================================================
// Child Class: Manager
// A Manager is an Employee who leads a department
// ============================================================
class Manager extends Employee {

    String department; // The department this manager is in charge of

    // Constructor: name goes to Employee, department stays here
    public Manager(String name, String department) {
        super(name);           // Call Employee's constructor with name
        this.department = department;
    }

    // Override displayInfo() to show name AND department
    public void displayInfo() {
        System.out.println("Name: " + name);              // Inherited field
        System.out.println("Department: " + department);  // Own field
    }
}

// ============================================================
// Child Class: Developer
// A Developer is an Employee who specializes in a programming language
// ============================================================
class Developer extends Employee {

    String programmingLanguage; // The coding language this developer uses

    // Constructor: name goes to Employee, language stays here
    public Developer(String name, String programmingLanguage) {
        super(name);                           // Call Employee's constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Override displayInfo() to show name AND programming language
    public void displayInfo() {
        System.out.println("Name: " + name);                              // Inherited
        System.out.println("Programming Language: " + programmingLanguage); // Own field
    }
}
