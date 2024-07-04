public class ShortDeclaration {
    public static void main(String[] args) {
        // Direct declaration and initialization
        short shortLiteral = 100;

        // Type casting from an int
        int intValue = 100;
        short shortCast = (short) intValue;

        // Using arithmetic expressions
        short shortCalculation = (short) (50 + 50);

        // Using the Short wrapper class
        Short shortObject = 100; // Autoboxing
        short shortFromObject = shortObject; // Unboxing

        // Using String parsing
        short shortFromString = Short.parseShort("100");

        // Print values
        System.out.println("shortLiteral: " + shortLiteral);
        System.out.println("shortCast: " + shortCast);
        System.out.println("shortCalculation: " + shortCalculation);
        System.out.println("shortObject: " + shortObject);
        System.out.println("shortFromObject: " + shortFromObject);
        System.out.println("shortFromString: " + shortFromString);
    }
}

/*This Java program demonstrates various ways to declare and use `short` variables. Here’s a detailed explanation of each part of the code:

### Code Explanation

1. **Class Declaration and Main Method:**
    ```java
    public class ShortDeclaration {
        public static void main(String[] args) {
    ```
    - The class `ShortDeclaration` is defined.
    - The `main` method is the entry point of the program.

2. **Direct Declaration and Initialization:**
    ```java
    short shortLiteral = 100;
    ```
    - A `short` variable `shortLiteral` is declared and initialized with a literal value `100`.

3. **Type Casting from an int:**
    ```java
    int intValue = 100;
    short shortCast = (short) intValue;
    ```
    - An `int` variable `intValue` is declared and initialized with a value `100`.
    - The `int` value is explicitly cast to a `short` using `(short)` before assignment to the `short` variable `shortCast`.

4. **Using Arithmetic Expressions:**
    ```java
    short shortCalculation = (short) (50 + 50);
    ```
    - An arithmetic expression `50 + 50` is evaluated to produce the result `100`.
    - The result, which is of type `int` by default, is explicitly cast to `short` before assignment to the `short` variable `shortCalculation`.

5. **Using the Short Wrapper Class:**
    ```java
    Short shortObject = 100; // Autoboxing
    short shortFromObject = shortObject; // Unboxing
    ```
    - A `Short` object `shortObject` is initialized with a `short` value `100`. This process is known as autoboxing, where a primitive `short` is automatically converted to a `Short` object.
    - The `short` value is retrieved from the `Short` object using unboxing, where the `Short` object is automatically converted to a primitive `short`.

6. **Using String Parsing:**
    ```java
    short shortFromString = Short.parseShort("100");
    ```
    - A `short` variable `shortFromString` is initialized by parsing the string `"100"` using `Short.parseShort()`, which converts the string to a `short`.

7. **Printing Values:**
    ```java
    System.out.println("shortLiteral: " + shortLiteral);
    System.out.println("shortCast: " + shortCast);
    System.out.println("shortCalculation: " + shortCalculation);
    System.out.println("shortObject: " + shortObject);
    System.out.println("shortFromObject: " + shortFromObject);
    System.out.println("shortFromString: " + shortFromString);
    ```
    - Each of the `short` variables is printed to the console using `System.out.println`.

### Output Explanation
When this program is run, it will print the following:

```
shortLiteral: 100
shortCast: 100
shortCalculation: 100
shortObject: 100
shortFromObject: 100
shortFromString: 100
```

- **shortLiteral:** Prints the value `100` assigned using the short literal.
- **shortCast:** Prints the value `100` which was type cast from an `int` variable.
- **shortCalculation:** Prints the result of the addition calculation, which is `100`.
- **shortObject:** Prints the value `100` stored in the `Short` object due to autoboxing.
- **shortFromObject:** Prints the value `100` extracted from the `Short` object due to unboxing.
- **shortFromString:** Prints the value `100` obtained from parsing the string `"100"`.

This program effectively demonstrates the different methods to declare and work with `short` variables in Java. */