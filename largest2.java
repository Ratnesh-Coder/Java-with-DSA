
import java.util.*;
public class largest2 {
    public static void main (String args[]) {
        // \u000d Scanner sc = new Scanner (System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your friend's age: ");
        int fage = sc.nextInt();
        sc.close();
        if (age>fage) {
            System.out.print("You are older than your friend.");
        }
        else {
            System.out.print("Your friend is older than you.");
        }
    }
}