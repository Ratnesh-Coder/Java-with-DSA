import java.util.*;
public class do_while_loop {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter count: ");
        int c = sc.nextInt();
        sc.close();
        int counter = 1;
        do {
            System.out.println("Hello, World");
            counter++;
        } while (counter<=c);
     }
}