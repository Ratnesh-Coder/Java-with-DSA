import java.util.*;
public class function_factorial {
    public static int factorial( int a) {
        int fact = 1;
        for (int i=1; i<=a; i++) {
            fact = fact * i;
        }
        return fact;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();
            System.out.println("Factorial of " + num + " is " + factorial(num));
        }
        finally {
            sc.close();
        }
    }
}