import java.util.*;
public class function_overloading {
    public static int sum (int a, int b) {
        return a + b;
    }
    public static int sum (int a, int b, int c) {
        return a + b + c;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("How many numbers you want to add: ");
            int n =sc.nextInt();
            if (n == 2) {
            System.out.print("Enter num1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter num2: ");
            int num2 = sc.nextInt();
            System.out.println("Sum is: " + sum(num1, num2));
            }
            else if (n == 3) {
                System.out.print("Enter num1: ");
                int num1 = sc.nextInt();
                System.out.print("Enter num2: ");
                int num2 = sc.nextInt();
                System.out.print("Enter num3: ");
                int num3 = sc.nextInt();
                System.out.println("Sum is: " + sum(num1, num2, num3));
            }
        }
        finally {
            sc.close();
        }
    }
}