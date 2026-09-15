import java.util.*;
public class CharacterPyramid {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter no. of rows: ");
        int r = sc.nextInt();
        char ch = 'A';
        for (int i=0; i<r; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}