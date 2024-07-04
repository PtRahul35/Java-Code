import java.util.Scanner;

public class Scan1 {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        System.out.print("Please Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + ", tell me your age");
        int age = input.nextInt();
        System.out.print("Your age is " +age);
    }
}


/*Sure! Here's an explanation of your Java code in simple words:

1. **Importing Scanner:** The line `import java.util.Scanner;` tells Java to use the Scanner class, which is a part of the Java library used for getting input from the user.

2. **Class Definition:** `public class Scan1 { ... }` defines a public class named `Scan1`. Everything inside the curly braces `{}` is part of this class.

3. **Main Method:** `public static void main(String[] args) { ... }` is the main method. It's where the program starts running.

4. **Creating a Scanner Object:** `Scanner input = new Scanner(System.in);` creates a Scanner object called `input` that will read user input from the keyboard.

5. **Prompting for Name:** 
   - `System.out.print("Please Enter Your Name: ");` displays the message "Please Enter Your Name:" on the screen.
   - `String name = input.nextLine();` reads the user's input (their name) and stores it in a variable named `name`.

6. **Greeting the User:** `System.out.println("Good Morning " + name);` prints "Good Morning" followed by the user's name.

7. **Asking for Age:** 
   - `System.out.print(name + ", tell me your age");` displays the message "<name>, tell me your age" where `<name>` is the name the user entered.
   - `int age = input.nextInt();` reads the user's input (their age) and stores it in a variable named `age`.

8. **Displaying Age:** `System.out.print("Your age is " + age);` prints "Your age is" followed by the user's age.

In summary, this code asks the user for their name and age, then greets them and repeats their age back to them. */