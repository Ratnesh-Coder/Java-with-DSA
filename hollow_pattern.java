import java.util.*;
public class hollow_pattern {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter no. of rows: ");
            int rows = sc.nextInt();
            System.out.print("Enter no. of colums: ");
            int columns = sc.nextInt();
            for (int i=1; i<=rows; i++) {
                for (int j=1; j<=columns; j++) {
                    if (i==1 || i==rows || j==1 || j==columns) {
                System.out.print("* ");
                    }
                    else {
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
    }
        finally {
            sc.close();
        }
    }
}