public class IntExample3 {
    public static void main(String[] args) {
        int number1 = 50, number2 = 60, number3 = 70;

        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
        System.out.println("Number 3: " + number3);
    }
}

/* Certainly! Let's go through the `Example3` class code line by line to understand what it does:

```java
public class Example3 {
```
- This line declares a public class named `Example3`. In Java, a class is a blueprint for objects that encapsulates data and methods. The `public` keyword means this class can be accessed from other classes.

```java
    public static void main(String[] args) {
```
- This line declares the `main` method, which is the entry point of any Java application. The `public` keyword means it can be accessed from outside the class. `static` means this method can be called without creating an instance of the class. `void` means this method does not return any value. `String[] args` is an array of strings that stores command-line arguments passed to the program.

```java
        int number1 = 50, number2 = 60, number3 = 70;
```
- This line declares and initializes three integer variables, `number1`, `number2`, and `number3`, in a single statement. `number1` is assigned the value `50`, `number2` is assigned the value `60`, and `number3` is assigned the value `70`.

```java
        System.out.println("Number 1: " + number1);
```
- This line prints the value of `number1` to the console. The output will be the string "Number 1: " followed by the value of `number1`, which is `50`.

```java
        System.out.println("Number 2: " + number2);
```
- This line prints the value of `number2` to the console. The output will be the string "Number 2: " followed by the value of `number2`, which is `60`.

```java
        System.out.println("Number 3: " + number3);
```
- This line prints the value of `number3` to the console. The output will be the string "Number 3: " followed by the value of `number3`, which is `70`.

```java
    }
```
- This line closes the `main` method.

```java
}
```
- This line closes the `Example3` class.

### Summary
When you run this program, it will declare and initialize three integer variables, `number1`, `number2`, and `number3`, with the values `50`, `60`, and `70`, respectively. Then it will print these values to the console. The output of the program will be:

```
Number 1: 50
Number 2: 60
Number 3: 70
```

This simple program demonstrates how to declare and initialize multiple variables in a single statement and how to print their values using the `System.out.println` method in Java. */