import java.util.*;
public class function_sum {
    public static int sum (int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static void main (String args[]) {
        Scanner sc =  new Scanner (System.in);
        System.out.print("Enter num1: ");
        int a =  sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Sum: " + sum(a, b));
    }
}