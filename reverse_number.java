import java.util.*;
public class reverse_number {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int rem = 0;
        int rev = 0;
        while (n>0) {
            rem = n%10;
            n = n/10;
           rev = (rev * 10) + rem;
        }
        System.out.print(rev);
    }
}