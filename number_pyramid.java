import java.util.*;
public class number_pyramid {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter no. of rows: ");
            int rows = sc.nextInt();
            int counter = 1;
            for (int i=1; i<=rows; i++) {
                for (int j=1; j<=i; j++) {
                    System.out.print(counter);
                    counter++;
                }
                System.out.println();
            }
        }
        finally {
            sc.close();
        }
    }
}