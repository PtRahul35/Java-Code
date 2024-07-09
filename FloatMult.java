import java.util.*;
public class FloatMult {
    public static void main(String[] args) {
        
        Scanner floMult = new Scanner (System.in);
        System.out.println("Enter Your Two Number Separated with Commas: ");
        float a = floMult.nextInt();
        float b = floMult.nextInt();
        float c = (a*b);

        System.out.println("Your Answer is: " +c);


    }
}
