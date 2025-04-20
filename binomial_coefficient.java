import java.util.*;
public class binomial_coefficient {
    public static int factorial(int x) {
        int fact = 1; 
        for (int i=1; i<=x; i++) {
            fact*=i;
        }
        return fact;
    }
    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            System.out.print("Enter r: ");
            int r = sc.nextInt();
            System.out.println("Binomial Coffecient: " + binCoeff(n, r));
        }
        finally {
            sc.close();
        }
    }
}