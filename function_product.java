 import java.util.*;
 public class function_product {
    public static int product(int a, int b) {
        int product = a * b;
        return product;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int a = sc.nextInt();
        System.out.print("Enter num2: ");
        int b = sc.nextInt();
        sc.close();
        System.out.println("Product: " + product(a, b));
    }
 }