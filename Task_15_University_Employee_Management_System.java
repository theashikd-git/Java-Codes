// 5. Exception Handling
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

// 1. Abstraction
abstract class Employee {

    // 3. Encapsulation
    private int employeeId;
    private String name;
    private double salary;

    public Employee(int employeeId, String name, double salary)
            throws InvalidSalaryException {

        if (salary <= 0) {
            throw new InvalidSalaryException("Salary must be greater than 0");
        }

        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // 3. Encapsulation - Getters and Setters
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 1. Abstraction - Abstract Method
    public abstract void calculateBonus();
}

// 2. Inheritance
class Teacher extends Employee {

    private int numberOfCourses;

    public Teacher(int employeeId, String name, double salary,
                   int numberOfCourses)
            throws InvalidSalaryException {

        super(employeeId, name, salary);
        this.numberOfCourses = numberOfCourses;
    }

    // 4. Polymorphism - Method Overriding
    @Override
    public void calculateBonus() {
        double bonus = getSalary() * 0.15;
        System.out.println("Teacher Bonus: " + bonus);
    }
}

// 2. Inheritance
class AdministrativeStaff extends Employee {

    private int overtimeHours;

    public AdministrativeStaff(int employeeId, String name,
                               double salary, int overtimeHours)
            throws InvalidSalaryException {

        super(employeeId, name, salary);
        this.overtimeHours = overtimeHours;
    }

    // 4. Polymorphism - Method Overriding
    @Override
    public void calculateBonus() {
        double bonus = getSalary() * 0.10 + (overtimeHours * 50);
        System.out.println("Administrative Staff Bonus: " + bonus);
    }
}

public class Main {

    public static void main(String[] args) {

        try { // 5. Exception Handling

            // 4. Runtime Polymorphism
            Employee e1 = new Teacher(101, "Rahim", 50000, 4);
            Employee e2 = new AdministrativeStaff(201, "Karim", 30000, 10);

            System.out.println("University Employee Management System");
            System.out.println("-------------------------------------");

            e1.calculateBonus();
            e2.calculateBonus();

        } catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
