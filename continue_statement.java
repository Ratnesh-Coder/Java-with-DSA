import java.util.*;
public class continue_statement {
    public static void main (String args []) {
        Scanner sc = new Scanner (System.in);
        try {
        System.out.print("Enter number you want to check: ");
        int num = sc.nextInt();
        while (true) {
           System.out.print("Enter a number: ");
           int n = sc.nextInt();
           //System.out.print(n);
           if (num%n==0) {
            continue;
           }
           System.out.println(n);
        }
    }
    finally {
        sc.close();
    }
    }
}