public class BooleanDeclaration {
    public static void main(String[] args) {
        // Direct declaration and initialization
        boolean boolLiteralTrue = true;
        boolean boolLiteralFalse = false;

        // Using expressions and conditions
        boolean isGreater = 10 > 5;  // true
        boolean isEqual = 10 == 10;  // true

        // Using logical operators
        boolean andOperation = true && false;  // false
        boolean orOperation = true || false;   // true
        boolean notOperation = !true;          // false

        // Using the Boolean wrapper class
        Boolean booleanObject = true;  // Autoboxing
        boolean booleanFromObject = booleanObject;  // Unboxing

        // Using String parsing
        boolean parsedBoolean = Boolean.parseBoolean("true");

        // Print values
        System.out.println("boolLiteralTrue: " + boolLiteralTrue);
        System.out.println("boolLiteralFalse: " + boolLiteralFalse);
        System.out.println("isGreater: " + isGreater);
        System.out.println("isEqual: " + isEqual);
        System.out.println("andOperation: " + andOperation);
        System.out.println("orOperation: " + orOperation);
        System.out.println("notOperation: " + notOperation);
        System.out.println("booleanObject: " + booleanObject);
        System.out.println("booleanFromObject: " + booleanFromObject);
        System.out.println("parsedBoolean: " + parsedBoolean);
    }
}


/*This Java program demonstrates various ways to declare and use `boolean` variables. Here’s a detailed explanation of each part of the code:

### Code Explanation

1. **Class Declaration and Main Method:**
    ```java
    public class BooleanDeclaration {
        public static void main(String[] args) {
    ```
    - The class `BooleanDeclaration` is defined.
    - The `main` method is the entry point of the program.

2. **Direct Declaration and Initialization:**
    ```java
    boolean boolLiteralTrue = true;
    boolean boolLiteralFalse = false;
    ```
    - Two `boolean` variables `boolLiteralTrue` and `boolLiteralFalse` are declared and initialized with the literal values `true` and `false`, respectively.

3. **Using Expressions and Conditions:**
    ```java
    boolean isGreater = 10 > 5;  // true
    boolean isEqual = 10 == 10;  // true
    ```
    - `boolean` variable `isGreater` is assigned the result of the expression `10 > 5`, which is `true`.
    - `boolean` variable `isEqual` is assigned the result of the expression `10 == 10`, which is also `true`.

4. **Using Logical Operators:**
    ```java
    boolean andOperation = true && false;  // false
    boolean orOperation = true || false;   // true
    boolean notOperation = !true;          // false
    ```
    - `boolean` variable `andOperation` is assigned the result of the logical AND operation `true && false`, which is `false`.
    - `boolean` variable `orOperation` is assigned the result of the logical OR operation `true || false`, which is `true`.
    - `boolean` variable `notOperation` is assigned the result of the logical NOT operation `!true`, which is `false`.

5. **Using the Boolean Wrapper Class:**
    ```java
    Boolean booleanObject = true;  // Autoboxing
    boolean booleanFromObject = booleanObject;  // Unboxing
    ```
    - `Boolean` object `booleanObject` is initialized with a `boolean` value `true`. This process is known as autoboxing, where a primitive `boolean` is automatically converted to a `Boolean` object.
    - The `boolean` value is retrieved from the `Boolean` object using unboxing, where the `Boolean` object is automatically converted to a primitive `boolean`.

6. **Using String Parsing:**
    ```java
    boolean parsedBoolean = Boolean.parseBoolean("true");
    ```
    - `boolean` variable `parsedBoolean` is initialized by parsing the string `"true"` using `Boolean.parseBoolean()`, which converts the string to a `boolean`.

7. **Printing Values:**
    ```java
    System.out.println("boolLiteralTrue: " + boolLiteralTrue);
    System.out.println("boolLiteralFalse: " + boolLiteralFalse);
    System.out.println("isGreater: " + isGreater);
    System.out.println("isEqual: " + isEqual);
    System.out.println("andOperation: " + andOperation);
    System.out.println("orOperation: " + orOperation);
    System.out.println("notOperation: " + notOperation);
    System.out.println("booleanObject: " + booleanObject);
    System.out.println("booleanFromObject: " + booleanFromObject);
    System.out.println("parsedBoolean: " + parsedBoolean);
    ```
    - Each of the `boolean` variables is printed to the console using `System.out.println`.

### Output Explanation
When this program is run, it will print the following:

```
boolLiteralTrue: true
boolLiteralFalse: false
isGreater: true
isEqual: true
andOperation: false
orOperation: true
notOperation: false
booleanObject: true
booleanFromObject: true
parsedBoolean: true
```

- **boolLiteralTrue:** Prints the value `true` assigned using the boolean literal.
- **boolLiteralFalse:** Prints the value `false` assigned using the boolean literal.
- **isGreater:** Prints the result of the comparison `10 > 5`, which is `true`.
- **isEqual:** Prints the result of the comparison `10 == 10`, which is `true`.
- **andOperation:** Prints the result of the logical AND operation `true && false`, which is `false`.
- **orOperation:** Prints the result of the logical OR operation `true || false`, which is `true`.
- **notOperation:** Prints the result of the logical NOT operation `!true`, which is `false`.
- **booleanObject:** Prints the value `true` stored in the `Boolean` object due to autoboxing.
- **booleanFromObject:** Prints the value `true` extracted from the `Boolean` object due to unboxing.
- **parsedBoolean:** Prints the value `true` obtained from parsing the string `"true"`.

This program effectively demonstrates the different methods to declare and work with `boolean` variables in Java. */