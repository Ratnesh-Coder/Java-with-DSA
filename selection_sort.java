import java.util.*;
public class selection_sort {
    public static void selection(int[] arr, int size) {
        for (int i=0; i<size-1; i++) {
            int min = i;
            for (int j=i+1; j<size; j++) {
                if (arr[min] > arr[j]) {
                    min  = j;
                }
            }
            if (i != min) {
            arr[i] = arr[min] ^ arr[i];
            arr[min] = arr[min] ^ arr[i];
            arr[i] = arr[min] ^ arr[i];
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
            for (int i=0; i<size; i++) {
                arr[i] = sc.nextInt();
            }
            selection(arr, size);
            for (int i=0; i<size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        finally {
            sc.close();
        }
    }
}