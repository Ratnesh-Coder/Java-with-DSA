import java.util.*;
public class buy_and_sell_stocks {
    public static int stock (int[] price) {
        int n = price.length;
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i=0; i<n; i++) {
            if (price[i] > buyPrice) {
                int profit = price[i] - buyPrice;
                maxProfit = Math.max(profit, maxProfit);
            }
            else {
                buyPrice = price[i];
            }
        }
        if (maxProfit == 0) {
            return 0;
        }
        return maxProfit;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            System.out.print("Enter elements: ");
            int[] price = new int[size];
            for (int i=0; i<price.length; i++) {
                price[i] = sc.nextInt();
            }
            System.out.println(stock(price));
        }
        finally {
            sc.close();
        }
    }
}