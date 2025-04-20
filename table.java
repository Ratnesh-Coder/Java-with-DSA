import java.util.*;
public class table {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.print("Print table till: ");
        int r = sc.nextInt();
        sc.close();
        int tab;
        for (int i=0; i<=r; i++) {
            tab = n * i;
            System.out.println(n + " x " + i + " = " + tab);
        }
    }
}