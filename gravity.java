import java.util.*;
public class gravity {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter your weight in Kg: ");
            double weight = sc.nextDouble();
            double effective_weight = weight * 0.17;
            System.out.println("Your weight on moon would be: " + effective_weight);
        }
        finally {
            sc.close();
        }
    }
}