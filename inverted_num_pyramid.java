import java.util.*;
public class inverted_num_pyramid {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter number of rows: ");
            int rows = sc.nextInt();
            for (int i=rows; i>=1; i--) {
                for (int j=1; j<=i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
        finally {
            sc.close();
        }
    }
}