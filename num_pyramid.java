import java.util.*;
public class num_pyramid {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        sc.close();
        for (int i=1; i<=r; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}