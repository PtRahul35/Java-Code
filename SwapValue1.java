
import java.util.*;
public class SwapValue1 {
    
    public static void main (String args[]) {
        Scanner Swap = new Scanner (System.in);

        System.out.print("Give Me Your 1st Number: ");
        int a = Swap.nextInt();
        System.out.print("Give Me Your 2nd Number: ");
        int b = Swap.nextInt();

        int c;

        c=b;
        b=a;

        System.out.println("1st Number " +c);
        System.out.println("2nd Number " +b);



    }
}
