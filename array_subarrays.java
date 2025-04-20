import java.util.*;
public class array_subarrays {
    public static void subarrays (int arr[]) {
        int tsa = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=i; j<arr.length; j++) {
                int sum = 0;
                for (int k=i; k<=j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = sum + arr[k];
                }
                tsa++;
                System.out.print("Sum of elements: " + sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays: " + tsa);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int arr[] = new int[5];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            subarrays(arr);
        }
        finally {
            sc.close();
        }
    }
}