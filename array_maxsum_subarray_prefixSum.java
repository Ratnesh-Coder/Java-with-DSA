import java.util.*;
public class array_maxsum_subarray_prefixSum {
    public static int prefixSum(int[] arr) {
        int[] prefixArr = new int[arr.length];
        prefixArr[0] = arr[0];
        for (int i=1; i<arr.length; i++) {
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                sum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
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
            System.out.println(prefixSum(arr));
        }
        finally {
            sc.close();
        }
    }
}