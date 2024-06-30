public class CharDeclaration {
    public static void main(String[] args) {
        // Direct declaration and initialization with a character literal
        char charLiteral = 'A';

        // Using Unicode values
        char unicodeChar = '\u0041';  // Unicode for 'A'

        // Using integer values (ASCII)
        char asciiChar = 65;  // ASCII for 'A'

        // Using escape sequences
        char newLine = '\n';
        char tab = '\t';

        // Using the Character wrapper class
        Character charObject = 'A';  // Autoboxing
        char charFromObject = charObject;  // Unboxing

        // Print values
        System.out.println("charLiteral: " + charLiteral);
        System.out.println("unicodeChar: " + unicodeChar);
        System.out.println("asciiChar: " + asciiChar);
        System.out.println("newLine (printed as a line break)");
        System.out.println("tab: " + tab + " (printed as a tab space)");
        System.out.println("charObject: " + charObject);
        System.out.println("charFromObject: " + charFromObject);
    }
}

/*This Java program demonstrates various ways to declare and use `char` variables. Here’s a detailed explanation of each part of the code:

### Code Explanation

1. **Class Declaration and Main Method:**
    ```java
    public class CharDeclaration {
        public static void main(String[] args) {
    ```
    - The class `CharDeclaration` is defined.
    - The `main` method is the entry point of the program.

2. **Direct Declaration and Initialization with a Character Literal:**
    ```java
    char charLiteral = 'A';
    ```
    - A `char` variable `charLiteral` is declared and initialized with the character literal `'A'`.

3. **Using Unicode Values:**
    ```java
    char unicodeChar = '\u0041';  // Unicode for 'A'
    ```
    - A `char` variable `unicodeChar` is declared and initialized with the Unicode value `\u0041`, which represents the character `'A'`.

4. **Using Integer Values (ASCII):**
    ```java
    char asciiChar = 65;  // ASCII for 'A'
    ```
    - A `char` variable `asciiChar` is declared and initialized with the ASCII value `65`, which represents the character `'A'`.

5. **Using Escape Sequences:**
    ```java
    char newLine = '\n';
    char tab = '\t';
    ```
    - A `char` variable `newLine` is declared and initialized with the escape sequence `'\n'`, which represents a new line character.
    - A `char` variable `tab` is declared and initialized with the escape sequence `'\t'`, which represents a tab character.

6. **Using the Character Wrapper Class:**
    ```java
    Character charObject = 'A';  // Autoboxing
    char charFromObject = charObject;  // Unboxing
    ```
    - A `Character` object `charObject` is initialized with a `char` value `'A'`. This process is known as autoboxing, where a primitive `char` is automatically converted to a `Character` object.
    - The `char` value is retrieved from the `Character` object using unboxing, where the `Character` object is automatically converted to a primitive `char`.

7. **Printing Values:**
    ```java
    System.out.println("charLiteral: " + charLiteral);
    System.out.println("unicodeChar: " + unicodeChar);
    System.out.println("asciiChar: " + asciiChar);
    System.out.println("newLine (printed as a line break)");
    System.out.println("tab: " + tab + " (printed as a tab space)");
    System.out.println("charObject: " + charObject);
    System.out.println("charFromObject: " + charFromObject);
    ```
    - Each of the `char` variables is printed to the console using `System.out.println`.

### Output Explanation
When this program is run, it will print the following:

```
charLiteral: A
unicodeChar: A
asciiChar: A
newLine (printed as a line break)
tab: 	 (printed as a tab space)
charObject: A
charFromObject: A
```

- **charLiteral:** Prints the character `'A'` assigned using a character literal.
- **unicodeChar:** Prints the character `'A'` represented by the Unicode value `\u0041`.
- **asciiChar:** Prints the character `'A'` represented by the ASCII value `65`.
- **newLine:** Prints a new line (the actual output will have a line break).
- **tab:** Prints a tab space (the actual output will have a tab space).
- **charObject:** Prints the character `'A'` stored in the `Character` object due to autoboxing.
- **charFromObject:** Prints the character `'A'` extracted from the `Character` object due to unboxing.

This program effectively demonstrates the different methods to declare and work with `char` variables in Java. */