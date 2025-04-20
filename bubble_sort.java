import java.util.*;
public class bubble_sort {
    public static void bubble (int[] arr) {
        int n = arr.length;
        int swap;
        for (int i=0; i<n-1; i++) {
            swap = 0;
            for (int j=0; j<n-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                arr[j] = arr[j] ^ arr[j+1];
                arr[j+1] = arr[j] ^ arr[j+1];
                arr[j] = arr[j] ^ arr[j+1];
                swap++;
                }
            }
            if (swap == 0) {
                break;
            }
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter size of array: ");
            int size = sc.nextInt();
            System.out.print("Enter elements: ");
            int[] arr = new int[size];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            bubble(arr);
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        finally {
            sc.close();
        }
    }
}