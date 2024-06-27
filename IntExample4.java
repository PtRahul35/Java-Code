public class IntExample4 {
    public static void main(String[] args) {
        Integer number1 = 80; // Autoboxing from int to Integer
        Integer number2 = new Integer (90); // Explicitly creating an Integer object

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}


/*Certainly! Let's go through the `Example4` class code line by line to understand what it does:

```java
public class Example4 {
```
- This line declares a public class named `Example4`. In Java, a class is a blueprint for objects that encapsulates data and methods. The `public` keyword means this class can be accessed from other classes.

```java
    public static void main(String[] args) {
```
- This line declares the `main` method, which is the entry point of any Java application. The `public` keyword means it can be accessed from outside the class. `static` means this method can be called without creating an instance of the class. `void` means this method does not return any value. `String[] args` is an array of strings that stores command-line arguments passed to the program.

```java
        Integer number1 = 80; // Autoboxing from int to Integer
```
- This line declares an `Integer` object named `number1` and initializes it with the value `80`. In this context, autoboxing is taking place, where the primitive `int` value `80` is automatically converted into an `Integer` object.

```java
        Integer number2 = new Integer(90); // Explicitly creating an Integer object
```
- This line declares another `Integer` object named `number2` and initializes it with the value `90` by explicitly creating a new `Integer` object using the `new` keyword. Note that creating `Integer` objects using the `new` keyword is generally discouraged in modern Java because it is less efficient than using autoboxing.

```java
        System.out.println("Number 1: " + number1);
```
- This line prints the value of `number1` to the console. The output will be the string "Number 1: " followed by the value of `number1`, which is `80`.

```java
        System.out.println("Number 2: " + number2);
```
- This line prints the value of `number2` to the console. The output will be the string "Number 2: " followed by the value of `number2`, which is `90`.

```java
    }
```
- This line closes the `main` method.

```java
}
```
- This line closes the `Example4` class.

### Summary
When you run this program, it will declare two `Integer` objects, `number1` and `number2`, with the values `80` and `90` respectively. `number1` is created using autoboxing, while `number2` is created explicitly using the `new` keyword. Then, it will print these values to the console. The output of the program will be:

```
Number 1: 80
Number 2: 90
```

This example demonstrates the use of autoboxing and the explicit creation of `Integer` objects in Java, as well as printing their values using the `System.out.println` method. */

