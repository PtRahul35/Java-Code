
import java.util.Scanner;

public class ScaAddInt {
    
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your two number: ");
        int a = input.nextInt();
        System.out.println( "Your Number is " +a );
    }

}

/*Certainly! Let's go through this code step by step:

1. **Importing Scanner Class**:
   ```java
   import java.util.Scanner;
   ```
   This line imports the `Scanner` class from the `java.util` package, which is used to get user input.

2. **Class Declaration**:
   ```java
   public class ScaAddInt {
   ```
   This line declares a public class named `ScaAddInt`.

3. **Main Method**:
   ```java
   public static void main(String[] args) {
   ```
   This is the main method, which is the entry point of the program. The program starts executing from here.

4. **Creating Scanner Object**:
   ```java
   Scanner input = new Scanner(System.in);
   ```
   This line creates a `Scanner` object named `input` that reads from the standard input (keyboard).

5. **Prompting and Reading User's Number**:
   ```java
   System.out.print("Enter Your two number: ");
   int a = input.nextInt();
   ```
   - `System.out.print("Enter Your two number: ");` displays the prompt "Enter Your two number: " without a newline.
   - `int a = input.nextInt();` reads an integer input by the user and stores it in the variable `a`.

6. **Displaying User's Number**:
   ```java
   System.out.println("Your Number is " + a);
   ```
   - `System.out.println("Your Number is " + a);` displays "Your Number is " followed by the integer value stored in the variable `a`.

### Summary:
This program prompts the user to enter a number (despite the prompt suggesting two numbers, the code only handles one). It then reads this number and displays it back to the user. There seems to be a mistake in the prompt message, as it suggests the user should enter two numbers, but the program only reads and displays one number. */
