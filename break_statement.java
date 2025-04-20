import java.util.*;
public class break_statement {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter count: ");
        int count = sc.nextInt();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        int i = 0;
        while (i <= count) {
            if (i == age) {
                break;
            }
            i++;
            System.out.print(i + " ");
        }
        // System.out.print(counter);
    }
}