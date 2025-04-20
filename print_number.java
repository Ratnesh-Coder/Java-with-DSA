import java.util.*;
public class print_number {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter count: ");
        int count = sc.nextInt();
        sc.close();
        int counter = 0;
        while (counter<=count) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}