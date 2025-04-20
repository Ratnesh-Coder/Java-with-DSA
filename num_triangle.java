import java.util.*;
public class num_triangle {
    public static void numTriangle (int rows) {
        for (int i=1; i<=rows; i++) {
            for (int k=1; k<=rows-i; k++) {
                System.out.print(" ");
            }    
                for (int j=1; j<=i; j++) {
                System.out.print(j);
                }
                for (int j=i-1; j>=1; j--) {
                    System.out.print(j);
                }
            System.out.println();
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter no. of rows: ");
            int rows = sc.nextInt();
            numTriangle(rows);
        }
        finally {
            sc.close();
        }
    }
}