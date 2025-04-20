import java.util.*;
public class character_pyramid {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        sc.close();
        char ch = 'A';
        for (int i=0; i<r; i++) {
            for (int j=0; j<i+1; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}