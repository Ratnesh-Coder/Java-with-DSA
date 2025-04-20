import java.util.*;
public class inverted_star_pyramid {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of rows: ");
        int rows = sc.nextInt();
        sc.close();
        for (int i=rows; i>=1; i--) {
            for (int j=1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}