import java.util.Scanner;

public class Scan3 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Thank You " +name);
        System.out.print("Tell Me Your Age");
        int age = input.nextInt();
        System.out.println("Hello, " +name);
        System.out.println("I Know Your details: ");
        System.out.println("Your Name is " +name);
        System.out.println("Your Age is "+age);

    }
}

/*Sure, let's go through the code step by step:

1. **Importing Scanner Class**:
   ```java
   import java.util.Scanner;
   ```
   This line imports the `Scanner` class from the `java.util` package, which is used to get user input.

2. **Class Declaration**:
   ```java
   public class Scan3 {
   ```
   This line declares a public class named `Scan3`.

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

5. **Prompting and Reading User's Name**:
   ```java
   System.out.print("Enter Your Name: ");
   String name = input.nextLine();
   System.out.println("Thank You " + name);
   ```
   - `System.out.print("Enter Your Name: ");` displays the prompt "Enter Your Name: " without a newline.
   - `String name = input.nextLine();` reads the entire line of text input by the user and stores it in the variable `name`.
   - `System.out.println("Thank You " + name);` displays "Thank You" followed by the user's name.

6. **Prompting and Reading User's Age**:
   ```java
   System.out.print("Tell Me Your Age");
   int age = input.nextInt();
   ```
   - `System.out.print("Tell Me Your Age");` displays the prompt "Tell Me Your Age".
   - `int age = input.nextInt();` reads an integer input by the user and stores it in the variable `age`.

7. **Displaying User Details**:
   ```java
   System.out.println("Hello, " + name);
   System.out.println("I Know Your details: ");
   System.out.println("Your Name is " + name);
   System.out.println("Your Age is " + age);
   ```
   - `System.out.println("Hello, " + name);` displays "Hello, " followed by the user's name.
   - `System.out.println("I Know Your details: ");` displays "I Know Your details: ".
   - `System.out.println("Your Name is " + name);` displays "Your Name is " followed by the user's name.
   - `System.out.println("Your Age is " + age);` displays "Your Age is " followed by the user's age.

In summary, this program prompts the user to enter their name and age, then it reads and stores these inputs, and finally, it displays the entered name and age along with some custom messages. */