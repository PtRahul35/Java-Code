/*In Java, there are several ways to take input from the user. Here are some of the most common methods:

1. **Using Scanner Class:**
   The `Scanner` class is a part of the `java.util` package and is used to obtain input of primitive types like `int`, `double`, etc., as well as strings.
   ```java
   import java.util.Scanner;

   public class InputExample {
       public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter your name: ");
           String name = scanner.nextLine();
           System.out.print("Enter your age: ");
           int age = scanner.nextInt();
           System.out.println("Name: " + name + ", Age: " + age);
       }
   }
   ```

2. **Using BufferedReader Class:**
   The `BufferedReader` class can be used to read text from an input stream (like the console). It is often wrapped around an `InputStreamReader`.
   ```java
   import java.io.BufferedReader;
   import java.io.InputStreamReader;
   import java.io.IOException;

   public class InputExample {
       public static void main(String[] args) throws IOException {
           BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           System.out.print("Enter your name: ");
           String name = reader.readLine();
           System.out.print("Enter your age: ");
           int age = Integer.parseInt(reader.readLine());
           System.out.println("Name: " + name + ", Age: " + age);
       }
   }
   ```

3. **Using Console Class:**
   The `Console` class provides methods to read text from the console. It can handle both password and standard input.
   ```java
   public class InputExample {
       public static void main(String[] args) {
           java.io.Console console = System.console();
           if (console != null) {
               String name = console.readLine("Enter your name: ");
               int age = Integer.parseInt(console.readLine("Enter your age: "));
               System.out.println("Name: " + name + ", Age: " + age);
           } else {
               System.out.println("No console available");
           }
       }
   }
   ```

4. **Using JOptionPane (for GUI-based input):**
   The `JOptionPane` class provides methods to create dialog boxes for input and output.
   ```java
   import javax.swing.JOptionPane;

   public class InputExample {
       public static void main(String[] args) {
           String name = JOptionPane.showInputDialog("Enter your name:");
           String ageString = JOptionPane.showInputDialog("Enter your age:");
           int age = Integer.parseInt(ageString);
           JOptionPane.showMessageDialog(null, "Name: " + name + ", Age: " + age);
       }
   }
   ```

5. **Using DataInputStream (not recommended for new code):**
   The `DataInputStream` class was used in older code but is not recommended for new code as it's more low-level and less convenient than `Scanner` or `BufferedReader`.
   ```java
   import java.io.DataInputStream;
   import java.io.IOException;

   public class InputExample {
       public static void main(String[] args) throws IOException {
           DataInputStream dis = new DataInputStream(System.in);
           System.out.print("Enter your name: ");
           String name = dis.readLine();
           System.out.print("Enter your age: ");
           int age = Integer.parseInt(dis.readLine());
           System.out.println("Name: " + name + ", Age: " + age);
       }
   }
   ```

Each of these methods has its own use cases and advantages. The `Scanner` class is the most commonly used method for console input due to its ease of use and flexibility. */