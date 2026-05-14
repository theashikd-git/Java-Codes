// ============================================================
// Task 11: Animal Inheritance
// ============================================================
// What this program does:
//   - Parent class "Animal" has common properties like name and age
//   - Child classes "Dog" and "Cat" inherit from Animal
//   - Each child overrides makeSound() with their own sound
// ============================================================

public class Main {
    public static void main(String[] args) {

        // Create a Dog named "Iron" who is 7 years old
        Dog dog = new Dog("Iron", 7);

        // Create a Cat named "Tusk" who is 5 years old
        Cat cat = new Cat("Tusk", 5);

        // Dog: show info and make sound
        dog.displayInfo();
        dog.makeSound();

        System.out.println(); // Empty line for spacing

        // Cat: show info and make sound
        cat.displayInfo();
        cat.makeSound();
    }
}

// ============================================================
// Parent Class: Animal
// ============================================================
class Animal {

    String name; // Animal's name
    int age;     // Animal's age

    // Constructor: sets name and age
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default sound method (child classes will override this)
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// ============================================================
// Child Class: Dog
// Inherits from Animal
// ============================================================
class Dog extends Animal {

    // Constructor calls parent constructor using super()
    public Dog(String name, int age) {
        super(name, age);
    }

    // Dog-specific display method
    public void displayInfo() {
        System.out.println("Dog Name: " + name);
        System.out.println("Age: " + age);
    }

    // Override makeSound()
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// ============================================================
// Child Class: Cat
// Inherits from Animal
// ============================================================
class Cat extends Animal {

    // Constructor calls parent constructor using super()
    public Cat(String name, int age) {
        super(name, age);
    }

    // Cat-specific display method
    public void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Age: " + age);
    }

    // Override makeSound()
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}
