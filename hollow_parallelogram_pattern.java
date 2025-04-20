import java.util.*;
public class hollow_parallelogram_pattern {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter no. of rows: ");
            int rows = sc.nextInt();
            for (int i=1; i<=rows; i++) {
                for (int k=1; k<=rows-i; k++) {
                    System.out.print("  ");
                }
                for (int j=1; j<=rows; j++) {
                    if (i==1 || i==rows || j==1 || j==rows)
                    System.out.print("* ");
                    else 
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
        finally {
            sc.close();
        }
    }
}