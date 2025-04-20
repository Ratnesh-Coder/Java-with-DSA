import java.util.*;
public class sum_even_odd {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        try {
        System.out.print("Enter range: ");
        int r = sc.nextInt();
        int even = 0;
        int odd = 0;
        System.out.print("Enter elements: ");
        for (int i=1; i<=r; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) {
                even = even + x;
            }
            else {
                odd = odd + x;
            }
        }
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
        }
        finally {
            sc.close();
        }
    }
}