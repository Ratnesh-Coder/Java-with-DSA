import java.util.*;
public class sum_digits {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0; 
        int rem;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num = num / 10;
        }
        System.out.println("Sum of the digits of " + temp + " is " + sum);
        }
        finally {
            sc.close();
        }
    }
}