import java.util.*;
public class reverse {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int r=0;
        while (n>0) {
            r = n%10;
            n = n / 10;
            System.out.print(r); 
        }
    } 
}