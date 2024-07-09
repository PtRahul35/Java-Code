import java.util.*;
class ArithmeticOperators {
    public static void main(String[] args) {
        
        Scanner A0 = new Scanner (System.in);
        System.out.println("Give me 1st number: ");
        int a = A0.nextInt();
        System.out.println("Give me 2nd number: ");
        int b = A0.nextInt();

        System.out.println("Addition: " +(a+b));
        System.out.println("Substraction: " +(a-b));
        System.out.println("Multiplication: " +(a*b));
        System.out.println("Division: " +(a/b));
        System.out.println("Remainder: " +(a%b));
    }
}