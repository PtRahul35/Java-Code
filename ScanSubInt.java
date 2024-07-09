import java.util.Scanner;

public class ScanSubInt {

    public static void main (String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.print("Enter Your Two Number: ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = num1-num2;

    System.err.println("Your Answer is " +num3);

    if (num1>num2) {
        System.out.println(num3);
    }
    else {
        System.err.println("Your Answer will be negative because You Given me First digit greater than Second digit " +num3);
    } 


    }

}
