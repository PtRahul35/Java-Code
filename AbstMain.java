/*Abstraction is a fundamental concept in object-oriented programming (OOP) that allows you to define classes that represent abstract concepts, hiding the implementation details and exposing only the necessary parts. In Java, abstraction is achieved using abstract classes and interfaces.

Abstract Classes
An abstract class is a class that cannot be instantiated and may contain abstract methods, which are methods without a body. Concrete subclasses must provide implementations for these abstract methods. */


abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("The animal is sleeping.");
    }
}

class Dog extends Animal {
    // Providing implementation for the abstract method
    public void makeSound() {
        System.out.println("Woof");
    }
}

public class AbstMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: Woof
        myDog.sleep();     // Outputs: The animal is sleeping.
    }
}


/*Sure! Let's break down the code step by step and explain it in simple terms.

### Abstract Class and Abstract Method

**Abstract Class**: 
- `Animal` is an abstract class. This means it cannot be instantiated directly (you can't create an object of `Animal`).
- An abstract class can have both abstract methods (methods without a body) and regular methods (methods with a body).

**Abstract Method**:
- `public abstract void makeSound();` is an abstract method. It does not have a body, meaning it doesn't provide an implementation. Any class that extends `Animal` must provide an implementation for this method.

### Concrete Class (Subclass)

**Concrete Class**:
- `Dog` is a class that extends `Animal`. This means `Dog` inherits from `Animal` and must implement all abstract methods in `Animal`.

**Implementing the Abstract Method**:
- `public void makeSound() { System.out.println("Woof"); }` provides the implementation for the `makeSound` method. When you call `makeSound` on a `Dog` object, it prints "Woof".

### Regular Method in Abstract Class

- `public void sleep() { System.out.println("The animal is sleeping."); }` is a regular method in the `Animal` class. It has a body, and it prints "The animal is sleeping." when called.

### Main Method

**Main Method**:
- `public class AbstMain` is the main class where the program execution starts.
- Inside the `main` method, a `Dog` object is created: `Dog myDog = new Dog();`.
- The `makeSound` method is called on `myDog`, which outputs "Woof".
- The `sleep` method is called on `myDog`, which outputs "The animal is sleeping."

### Simple Explanation

1. **Abstract Class and Method**:
   - You have a blueprint (`Animal`) that says every animal should be able to make a sound, but it doesn't specify what the sound is. This is like saying, "Every vehicle should be able to start," without specifying how.

2. **Concrete Class (Dog)**:
   - `Dog` is a specific type of animal. It knows exactly what sound it makes, so it provides the implementation for `makeSound` by saying "Woof".

3. **Regular Method (sleep)**:
   - `sleep` is a regular method that just prints "The animal is sleeping." It's like a general feature that all animals have.

4. **Main Method**:
   - You create a `Dog` object.
   - When you ask the dog to make a sound, it says "Woof".
   - When you tell the dog to sleep, it says "The animal is sleeping."

This way, you can create different animals (like `Cat`, `Bird`, etc.) by extending the `Animal` class and providing their specific sounds while sharing common behaviors like sleeping. */
