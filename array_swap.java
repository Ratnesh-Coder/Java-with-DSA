import java.util.*;
public class array_swap {
    public static void swap(int arr[]) {
        int first = 0, last = arr.length-1;
        while (first < last) {
            arr[first] = arr[first] ^ arr[last];
            arr[last] = arr[first] ^ arr[last];
            arr[first] = arr[first] ^ arr[last];
            first++;
            last--;
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int arr[] = new int [5];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Array: ");
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            swap(arr);
            System.out.println();
            System.out.print("Swapped array: ");
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        finally {
            sc.close();
        }
    }
}