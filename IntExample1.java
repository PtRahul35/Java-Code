//Declare Int Example 1
public class IntExample1 {
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        
        System.out.println("Number 1: " + number1);
        System.out.println("Number 2: " + number2);
    }
}


/* Sure, let's go through the code line by line to understand what each part does:

```java
public class Example1 {
```
- This line declares a public class named `Example1`. In Java, every application must have at least one class definition.

```java
    public static void main(String[] args) {
```
- This line declares the `main` method. The `main` method is the entry point for any Java application.
  - `public`: This is an access modifier that makes the `main` method accessible from outside the class.
  - `static`: This keyword means that the method belongs to the class, rather than an instance of the class. It can be called without creating an instance of the class.
  - `void`: This means that the method does not return any value.
  - `String[] args`: This is an array of `String` objects, which can store command-line arguments passed to the program.

```java
        int number1 = 10;
```
- This line declares an integer variable named `number1` and initializes it with the value `10`.

```java
        int number2 = 20;
```
- This line declares another integer variable named `number2` and initializes it with the value `20`.

```java
        System.out.println("Number 1: " + number1);
```
- This line prints the string `"Number 1: "` followed by the value of `number1` to the console. The `+` operator is used to concatenate the string and the value of the variable.

```java
        System.out.println("Number 2: " + number2);
```
- This line prints the string `"Number 2: "` followed by the value of `number2` to the console.

```java
    }
}
```
- These lines close the `main` method and the `Example1` class definition, respectively.

In summary, the program declares two integer variables, initializes them with values, and then prints these values to the console. When executed, the output will be:

```
Number 1: 10
Number 2: 20
``` */