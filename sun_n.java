import java.util.*;
public class sun_n {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter range: ");
        int n = sc.nextInt();
        sc.close();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}