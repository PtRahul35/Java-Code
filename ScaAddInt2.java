import java.util.Scanner;

public class ScaAddInt2 {
    
    public static void main(String[] args) {
    
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter your two numbers separated by a space: ");
            // Read two integers from the input
            int a = input.nextInt();
            int b = input.nextInt();
            // Display the sum of the two numbers
            System.out.println("The sum of the two numbers is: " + (a + b));
            // Close the scanner
        }
    }
}
