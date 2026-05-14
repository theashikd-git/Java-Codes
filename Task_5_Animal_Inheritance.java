// ============================================================
// Task 5 (Inheritance): Animal → Dog, Cat 
// ============================================================
// What this program does:
//   - Parent class "Animal" has a generic speak() method
//   - "Dog" and "Cat" OVERRIDE speak() with their own sounds
//   - This demonstrates POLYMORPHISM: same method name, different behavior
//
// Key Concepts:
//   - "extends" = inheritance (child gets parent's fields/methods)
//   - "super(name)" = call the parent class constructor
//   - Method OVERRIDING = redefining a parent method in the child
// ============================================================

public class AnimalInheritance {
    public static void main(String[] args) {

        // Create an Animal object (generic)
        Animal animal = new Animal("Generic Animal");

        // Create a Dog named "Buddy"
        Dog dog = new Dog("Buddy");

        // Create a Cat named "Whiskers"
        Cat cat = new Cat("Whiskers");

        // Each object calls speak() but behaves DIFFERENTLY
        // This is called Polymorphism!
        animal.speak(); // → "An animal makes a sound."
        dog.speak();    // → "Buddy barks."
        cat.speak();    // → "Whiskers meows."
    }
}

// ============================================================
// Parent Class: Animal
// ============================================================
class Animal {

    String name; // Animal's name

    // Constructor: set the animal's name
    public Animal(String name) {
        this.name = name;
    }

    // Generic speak method — child classes will override this
    public void speak() {
        System.out.println("An animal makes a sound.");
    }
}

// ============================================================
// Child Class: Dog — inherits from Animal
// ============================================================
class Dog extends Animal {

    // Constructor: passes name up to the Animal constructor
    public Dog(String name) {
        super(name); // "super" calls Animal's constructor
    }

    // Override speak() — Dog-specific behavior
    public void speak() {
        System.out.println(name + " barks."); // Uses inherited "name" field
    }
}

// ============================================================
// Child Class: Cat — inherits from Animal
// ============================================================
class Cat extends Animal {

    // Constructor: passes name up to the Animal constructor
    public Cat(String name) {
        super(name); // Call Animal's constructor
    }

    // Override speak() — Cat-specific behavior
    public void speak() {
        System.out.println(name + " meows."); // Uses inherited "name" field
    }
}
