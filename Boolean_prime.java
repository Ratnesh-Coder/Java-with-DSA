import java.util.*;
public class boolean_prime {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        boolean isPrime = true;
        if (n <= 1) {
            System.out.println(n + " is not a prime number");
            return ;
        }
        for (int i=2; i<=Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(n + " is a prime number.");
        }
        else {
            System.out.println(n + " is not a prime number.");
        }
    }
}