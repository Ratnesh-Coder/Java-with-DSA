import java.util.*;
public class even_odd {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enetr an integer: ");
        int num = sc.nextInt();
        sc.close();
        if (num%2==0) {
            System.out.print("Even number.");
        }
        else {
            System.out.print("Odd number.");
        }
    }
}