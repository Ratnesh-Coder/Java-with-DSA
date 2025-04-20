import java.util.*;
public class prime_range {
    public static boolean isPrime (int i) {
        boolean isPrime = true;
            for (int j=2; j<=Math.sqrt(i); j++) {
                if (i%j==0) {
                    isPrime = false;
                    break;
                }
            }
        return isPrime;
    }
    public static void main (String args[]) {
    Scanner sc = new Scanner (System.in);
    try {
        System.out.print("Enter range: ");
        int r = sc.nextInt();
        System.out.print("Prime numbers up to " + r + ": ");
        for (int i=2; i<=r; i++) {
        if (isPrime (i)) {
            System.out.print (i);
        }
    }
}
    finally {
        sc.close();
    }
}
}