import java.util.*;
public class UnaryOpera {
    public static void main(String[] args) {
        Scanner unary = new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int a = unary.nextInt();
        int b, c, d, e, f;

        b = -a;
        c = ++a;
        d = --a;
        e = a++;
        f = a--;

        System.out.println("Value is: " +b);
        System.out.println("Value is: " +c);
        System.out.println("Value is: " +d);
        System.out.println("Value is: " +e);
        System.out.println("Value is: " +f);        
    }
}
