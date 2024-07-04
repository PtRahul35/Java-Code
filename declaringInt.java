//How to declare Integers 

public class declaringInt {

    public static void main(String[] args) {
        
        int myNumber = 55;

        int newNumber;

        newNumber = 85; 

        newNumber = 87; 

        myNumber = newNumber;

       System.out.println(myNumber);
       System.out.println(newNumber);
    }
    
}

/* Let's go through the `declaringInt` class code line by line:

```java
public class declaringInt {
```
- This line declares a public class named `declaringInt`. In Java, a class is a blueprint for objects that defines a datatype by bundling data and methods that work on the data.

```java
    public static void main(String[] args) {
```
- This line declares the `main` method, which is the entry point of any Java application. The `public` keyword means it can be accessed from outside the class. `static` means this method can be called without creating an instance of the class. `void` means this method does not return a value. `String[] args` is an array of strings that stores command-line arguments.

```java
        int myNumber = 55;
```
- This line declares an integer variable named `myNumber` and initializes it with the value `55`.

```java
        int newNumber;
```
- This line declares another integer variable named `newNumber` but does not initialize it.

```java
        newNumber = 85;
```
- This line assigns the value `85` to the `newNumber` variable.

```java
        newNumber = 87;
```
- This line reassigns the value `87` to the `newNumber` variable, overwriting the previous value (`85`).

```java
        myNumber = newNumber;
```
- This line assigns the value of `newNumber` (which is `87`) to `myNumber`. Now, `myNumber` also holds the value `87`.

```java
       System.out.println(myNumber);
```
- This line prints the current value of `myNumber` to the console. Since `myNumber` was assigned the value of `newNumber`, it will print `87`.

```java
       System.out.println(newNumber);
```
- This line prints the current value of `newNumber` to the console, which is `87`.

```java
    }
```
- This line closes the `main` method.

```java
}
```
- This line closes the `declaringInt` class.

When you run this program, the output will be:
```
87
87
```

This is because both `myNumber` and `newNumber` end up holding the value `87` before they are printed. */
