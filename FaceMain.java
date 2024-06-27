interface Animal {
    void makeSound(); // Interface method (does not have a body)
    void sleep();     // Interface method (does not have a body)
}

class Dog implements Animal {
    // Providing implementation for the interface methods
    public void makeSound() {
        System.out.println("Woof");
    }

    public void sleep() {
        System.out.println("The dog is sleeping.");
    }
}

public class FaceMain {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.makeSound(); // Outputs: Woof
        myDog.sleep();     // Outputs: The dog is sleeping.
    }
}

