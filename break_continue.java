import java.util.*;
public class break_continue {
    public static void main (String args []) {
       Scanner sc = new Scanner (System.in);
       try {
            System.out.print("Enter number you want to check: ");
            int num = sc.nextInt();
            do {
                System.out.print("Enter number: ");
                int n = sc.nextInt();
                if (n == 1) {
                    System.out.println("Cannot check divisibility by 1. Please enter another number.");
                    continue;
                }
                if (num%n==0) {
                    System.out.print(num + " is divisible by " + n);
                    break;
                }
            } 
            while (true);
        }
        finally {
            sc.close();
        }
    } 
}