import java.util.*;
public class array_largest_smallest {
    public static int largest (int arr[]) {
        int large = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        return large;
    }
    public static int smallest (int arr[]) {
        int small = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        return small;
    }
    public static void main (String arhs[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int arr[] = new int [5];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The largest element is: " + largest(arr));
            System.out.println("The smallest element is: " + smallest(arr));
        }
        finally {
            sc.close();
        }
    }
}