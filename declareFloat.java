public class declareFloat {
    public static void main(String[] args) {
        // Using float literal with 'f' or 'F' suffix
        float floatLiteral1 = 10.5f;
        float floatLiteral2 = 20.3F;

        // Using type casting from a double value
        float floatCast = (float) 10.5;

        // Using the result of a calculation
        float floatCalculation = 10.0f / 2;

        // Using the Float class
        Float floatObject = 10.5f; // Autoboxing
        float floatFromObject = floatObject; // Unboxing

        // Print values
        System.out.println("floatLiteral1: " + floatLiteral1);
        System.out.println("floatLiteral2: " + floatLiteral2);
        System.out.println("floatCast: " + floatCast);
        System.out.println("floatCalculation: " + floatCalculation);
        System.out.println("floatObject: " + floatObject);
        System.out.println("floatFromObject: " + floatFromObject);
    }
}

/*    This Java program demonstrates different ways to declare and use `float` variables. Here’s a step-by-step explanation of the code:

### Code Explanation

1. **Class Declaration:**
    ```java
    public class FloatDeclaration {
        public static void main(String[] args) {
    ```
    - The class `FloatDeclaration` is defined.
    - The `main` method is the entry point of the program. 

2. **Using float literals with 'f' or 'F' suffix:**
    ```java
    float floatLiteral1 = 10.5f;
    float floatLiteral2 = 20.3F;
    ```
    - Two `float` variables, `floatLiteral1` and `floatLiteral2`, are declared and initialized with literal values.
    - The suffix 'f' or 'F' indicates that these literals are of type `float`.

3. **Using type casting from a double value:**
    ```java
    float floatCast = (float) 10.5;
    ```
    - A `double` literal `10.5` is explicitly cast to `float` using `(float)` before assignment to the `float` variable `floatCast`.

4. **Using the result of a calculation:**
    ```java
    float floatCalculation = 10.0f / 2;
    ```
    - A calculation `10.0f / 2` is performed. Since `10.0f` is a `float` literal, the result is also a `float`.
    - The result of the calculation is assigned to `floatCalculation`.

5. **Using the `Float` class:**
    ```java
    Float floatObject = 10.5f; // Autoboxing
    float floatFromObject = floatObject; // Unboxing
    ```
    - A `Float` object `floatObject` is initialized with a `float` value `10.5f`. This is known as autoboxing, where a primitive `float` is automatically converted to a `Float` object.
    - The `float` value is retrieved from the `Float` object using unboxing, where the `Float` object is automatically converted to a primitive `float`.

6. **Printing values:**
    ```java
    System.out.println("floatLiteral1: " + floatLiteral1);
    System.out.println("floatLiteral2: " + floatLiteral2);
    System.out.println("floatCast: " + floatCast);
    System.out.println("floatCalculation: " + floatCalculation);
    System.out.println("floatObject: " + floatObject);
    System.out.println("floatFromObject: " + floatFromObject);
    ```
    - Each of the `float` variables is printed to the console using `System.out.println`.

### Output Explanation
When this program is run, it will print the following:

```
floatLiteral1: 10.5
floatLiteral2: 20.3
floatCast: 10.5
floatCalculation: 5.0
floatObject: 10.5
floatFromObject: 10.5
```

- **floatLiteral1:** Prints the value `10.5` assigned using the literal with 'f' suffix.
- **floatLiteral2:** Prints the value `20.3` assigned using the literal with 'F' suffix.
- **floatCast:** Prints the value `10.5` which was type cast from a `double` literal.
- **floatCalculation:** Prints the result of the division calculation, which is `5.0`.
- **floatObject:** Prints the value `10.5` stored in the `Float` object due to autoboxing.
- **floatFromObject:** Prints the value `10.5` extracted from the `Float` object due to unboxing.

This program effectively demonstrates the different methods to declare and work with `float` variables in Java.
 */