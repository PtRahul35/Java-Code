public class IntExample2 {
    public static void main(String[] args) {
        int number1;
        int number2;

        number1 = 30;
        number2 = 40;

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}


/*Certainly! Let's go through the `IntExample2` class code line by line to understand what it does:

```java
public class IntExample2 {
```
- This line declares a public class named `IntExample2`. In Java, a class is a blueprint for objects that encapsulates data and methods. The `public` keyword means this class can be accessed from other classes.

```java
    public static void main(String[] args) {
```
- This line declares the `main` method, which is the entry point of any Java application. The `public` keyword means it can be accessed from outside the class. `static` means this method can be called without creating an instance of the class. `void` means this method does not return any value. `String[] args` is an array of strings that stores command-line arguments passed to the program.

```java
        int number1;
        int number2;
```
- These lines declare two integer variables, `number1` and `number2`. At this point, they are declared but not yet initialized.

```java
        number1 = 30;
```
- This line assigns the value `30` to the variable `number1`.

```java
        number2 = 40;
```
- This line assigns the value `40` to the variable `number2`.

```java
        System.out.println("Number 1: " + number1);
```
- This line prints the value of `number1` to the console. The output will be the string "Number 1: " followed by the value of `number1`, which is `30`.

```java
        System.out.println("Number 2: " + number2);
```
- This line prints the value of `number2` to the console. The output will be the string "Number 2: " followed by the value of `number2`, which is `40`.

```java
    }
```
- This line closes the `main` method.

```java
}
```
- This line closes the `IntExample2` class.

### Summary
When you run this program, it will declare two integer variables, `number1` and `number2`, assign the values `30` and `40` to them respectively, and then print these values to the console. The output of the program will be:

```
Number 1: 30
Number 2: 40
```

This simple program demonstrates how to declare variables, assign values to them, and print those values using the `System.out.println` method in Java. */