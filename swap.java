import java.util.*;
public class swap {
    public static void swapp (int a, int b) {
        int temp = b; 
        b = a; 
        a = temp;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        sc.close();
        swapp (a, b);
    }
}