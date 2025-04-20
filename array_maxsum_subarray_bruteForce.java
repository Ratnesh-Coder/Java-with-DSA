import java.util.*;
public class array_maxsum_subarray_bruteForce {
    public static void maxsum_subarray (int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                int sum = 0;
                for (int k=i; k<=j; k++) {
                    //System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print("Sum: " + sum);
                if (maxsum<sum) {
                    maxsum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Max sum is: " + maxsum);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int arr[] = new int[5];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            maxsum_subarray(arr);
        }
        finally {
            sc.close();
        }
    }
}