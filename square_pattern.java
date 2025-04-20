import java.util.*;
public class square_pattern {
    public static void main (String args []) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        sc.close();
        for (int i=1; i<=l; i++) {
            for (int j=1; j<=b; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}