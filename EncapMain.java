/*Encapsulation in Java is a mechanism of wrapping the data (variables) and the code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class are hidden from other classes and can be accessed only through the methods of their current class. This is done to protect the data from being accessed directly and to enforce a controlled and secure way of accessing it.

Key Points of Encapsulation:
Data Hiding: The data (variables) is hidden from other classes and can only be accessed through the methods (getters and setters) of the class in which it is defined.
Controlled Access: Methods can be used to control how the data is accessed and modified.
Improves Maintainability: By keeping the data and methods together, it becomes easier to manage and maintain the code. */

class Person {
    // Private variables - encapsulated data
    private String name;
    private int age;

    // Constructor to initialize Person object
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) { // Adding validation to ensure age is positive
            this.age = age;
        } else {
            System.out.println("Age must be positive.");
        }
    }

    // Method to display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class EncapMain {
    public static void main(String[] args) {
        // Creating a new Person object
        Person person = new Person("Alice", 30);

        // Accessing and modifying the data using methods
        person.displayPersonInfo(); // Outputs: Name: Alice, Age: 30

        person.setName("Bob");
        person.setAge(35);

        person.displayPersonInfo(); // Outputs: Name: Bob, Age: 35

        // Attempting to set an invalid age
        person.setAge(-5); // Outputs: Age must be positive.
    }
}

/*Sure! Let's break down the code step by step and explain it in simple terms.

### Encapsulation in the `Person` Class

**Encapsulation** is about bundling the data (variables) and methods (functions) that operate on the data into a single unit called a class. It also involves hiding the internal state of the object from the outside world and providing controlled access through methods.

### The `Person` Class

1. **Private Variables**:
   - `private String name;` and `private int age;` are private variables. This means they cannot be accessed directly from outside the `Person` class.

2. **Constructor**:
   - `public Person(String name, int age)` is a constructor. It is used to create objects of the `Person` class and initialize the variables `name` and `age`.

3. **Getter Methods**:
   - `public String getName()` and `public int getAge()` are getter methods. They allow other classes to read the values of `name` and `age`.

4. **Setter Methods**:
   - `public void setName(String name)` and `public void setAge(int age)` are setter methods. They allow other classes to modify the values of `name` and `age`.
   - The `setAge` method includes a validation check to ensure the age is positive. If the age is not positive, it prints an error message.

5. **Display Method**:
   - `public void displayPersonInfo()` is a method that prints the `name` and `age` of the person.

### The `EncapMain` Class

This class contains the `main` method, which is the entry point of the program.

1. **Creating a `Person` Object**:
   - `Person person = new Person("Alice", 30);` creates a new `Person` object with the name "Alice" and age 30.

2. **Displaying Initial Information**:
   - `person.displayPersonInfo();` calls the method to display the person's details. It outputs: `Name: Alice, Age: 30`.

3. **Modifying the Data**:
   - `person.setName("Bob");` changes the name to "Bob".
   - `person.setAge(35);` changes the age to 35.

4. **Displaying Modified Information**:
   - `person.displayPersonInfo();` again calls the method to display the updated details. It outputs: `Name: Bob, Age: 35`.

5. **Attempting to Set an Invalid Age**:
   - `person.setAge(-5);` tries to set the age to -5. Since the age is not positive, the `setAge` method prints: `Age must be positive.`

### Simple Explanation

1. **Encapsulation**:
   - The `Person` class encapsulates the data (name and age) and provides methods to access and modify this data. The data is hidden from direct access to protect it and ensure it's used correctly.

2. **Constructor**:
   - The constructor initializes a new `Person` object with a name and age.

3. **Getters and Setters**:
   - Getter methods (`getName`, `getAge`) are used to read the data.
   - Setter methods (`setName`, `setAge`) are used to modify the data. The `setAge` method includes a check to ensure the age is positive.

4. **Display Method**:
   - The `displayPersonInfo` method prints the person's details.

5. **Main Method**:
   - In the `main` method, a `Person` object is created, its details are displayed, the data is modified, and the updated details are displayed again. An attempt to set an invalid age shows how the validation in the setter method works.

This example shows how encapsulation helps protect the data and ensures it's accessed and modified in a controlled and secure way. */

