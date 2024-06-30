public class DoubleDeclaring {
    public static void main(String[] args) {
        // Using double literal
        double doubleLiteral = 10.5;

        // Using type casting from a float value
        double doubleCast = (double) 10.5f;

        // Using the result of a calculation
        double doubleCalculation = 10.0 / 2;

        // Using the Double class
        Double doubleObject = 10.5; // Autoboxing
        double doubleFromObject = doubleObject; // Unboxing

        // Print values
        System.out.println("doubleLiteral: " + doubleLiteral);
        System.out.println("doubleCast: " + doubleCast);
        System.out.println("doubleCalculation: " + doubleCalculation);
        System.out.println("doubleObject: " + doubleObject);
        System.out.println("doubleFromObject: " + doubleFromObject);
    }
}

/*  
 This Java program demonstrates different ways to declare and use `double` variables. Here’s a step-by-step explanation of the code:

### Code Explanation

1. **Class Declaration:**
    ```java
    public class DoubleDeclaration {
        public static void main(String[] args) {
    ```
    - The class `DoubleDeclaration` is defined.
    - The `main` method is the entry point of the program.

2. **Using double literals:**
    ```java
    double doubleLiteral = 10.5;
    ```
    - A `double` variable `doubleLiteral` is declared and initialized with a literal value `10.5`.

3. **Using type casting from a float value:**
    ```java
    double doubleCast = (double) 10.5f;
    ```
    - A `float` literal `10.5f` is explicitly cast to `double` using `(double)` before assignment to the `double` variable `doubleCast`.

4. **Using the result of a calculation:**
    ```java
    double doubleCalculation = 10.0 / 2;
    ```
    - A calculation `10.0 / 2` is performed. Since `10.0` is a `double` literal, the result is also a `double`.
    - The result of the calculation is assigned to `doubleCalculation`.

5. **Using the `Double` class:**
    ```java
    Double doubleObject = 10.5; // Autoboxing
    double doubleFromObject = doubleObject; // Unboxing
    ```
    - A `Double` object `doubleObject` is initialized with a `double` value `10.5`. This is known as autoboxing, where a primitive `double` is automatically converted to a `Double` object.
    - The `double` value is retrieved from the `Double` object using unboxing, where the `Double` object is automatically converted to a primitive `double`.

6. **Printing values:**
    ```java
    System.out.println("doubleLiteral: " + doubleLiteral);
    System.out.println("doubleCast: " + doubleCast);
    System.out.println("doubleCalculation: " + doubleCalculation);
    System.out.println("doubleObject: " + doubleObject);
    System.out.println("doubleFromObject: " + doubleFromObject);
    ```
    - Each of the `double` variables is printed to the console using `System.out.println`.

### Output Explanation
When this program is run, it will print the following:

```
doubleLiteral: 10.5
doubleCast: 10.5
doubleCalculation: 5.0
doubleObject: 10.5
doubleFromObject: 10.5
```

- **doubleLiteral:** Prints the value `10.5` assigned using the double literal.
- **doubleCast:** Prints the value `10.5` which was type cast from a `float` literal.
- **doubleCalculation:** Prints the result of the division calculation, which is `5.0`.
- **doubleObject:** Prints the value `10.5` stored in the `Double` object due to autoboxing.
- **doubleFromObject:** Prints the value `10.5` extracted from the `Double` object due to unboxing.

This program effectively demonstrates the different methods to declare and work with `double` variables in Java.
 */
