// ============================================================
// Task 4 (OOP Basics): BankAccount with Constructor Overloading
// ============================================================
// What this program does:
//   - Defines a "BankAccount" class with accountNumber and balance
//   - Has TWO constructors (this is called "Constructor Overloading")
//     1. No-argument constructor: sets default values
//     2. Parameterized constructor: sets custom values
//   - Creates two BankAccount objects and prints their info
//
// Key Concept: CONSTRUCTOR OVERLOADING
//   You can have multiple constructors with DIFFERENT parameters
//   Java automatically picks the right one based on how you call it
// ============================================================

// Define the BankAccount class
class BankAccount {

    String accountNumber; // The account number (e.g., "AC12345")
    double balance;       // Current balance in the account

    // --------------------------------------------------------
    // Constructor 1: No-argument (default) constructor
    // Called when NO values are passed: new BankAccount()
    // Sets default placeholder values
    // --------------------------------------------------------
    BankAccount() {
        this.accountNumber = "Not Assigned"; // Default value
        this.balance = 0.0;                  // Default balance is zero
    }

    // --------------------------------------------------------
    // Constructor 2: Parameterized constructor
    // Called when values ARE passed: new BankAccount("AC12345", 5000)
    // Sets the account number and balance to provided values
    // --------------------------------------------------------
    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method: display account information
    void print() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println(); // Blank line after each account
    }
}

// ============================================================
// Main class
// ============================================================
public class Main {
    public static void main(String[] args) {

        // acc1 uses the NO-ARGUMENT constructor
        // → accountNumber = "Not Assigned", balance = 0.0
        BankAccount acc1 = new BankAccount();

        // acc2 uses the PARAMETERIZED constructor
        // → accountNumber = "AC12345", balance = 5000
        BankAccount acc2 = new BankAccount("AC12345", 5000);

        // Display Account 1 info
        System.out.println("Account 1 Info:");
        acc1.print();

        // Display Account 2 info
        System.out.println("Account 2 Info:");
        acc2.print();
    }
}
