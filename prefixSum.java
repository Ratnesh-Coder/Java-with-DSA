import java.util.*;
public class prefixSum {
    public static int sum (int[] arr) {
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i=1; i<arr.length; i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.print("Prefix Sum Array: ");
        for (int num:prefix) {
            System.out.print(num + " ");
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int arr[] = new int [5];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("Sum: " + sum(arr));
        }
        finally {
            sc.close();
        }
    }
}