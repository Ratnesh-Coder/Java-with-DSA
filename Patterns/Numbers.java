import java.util.*;
public class Numbers {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
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
}