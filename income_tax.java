
import java.util.*;
public class income_tax {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enetr your income: ");
        int income  = sc.nextInt();
        sc.close();
        float tax;
        if (income<500000) {
            tax = income * 0;
        }
        else if (income>= 500000 && income <= 1000000) {
            tax = income * 0.2f;
        }
        else {
            tax = income * 0.3f;
        }
        System.out.println("Tax you have to pay: " + tax);
    }
}