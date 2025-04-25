import java.util.*;
public class insertion_sort {
    public static void insertion (int[] arr) {
        for (int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev>=0 && curr < arr[prev]) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr; 
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
            insertion(arr);
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        finally {
            sc.close();
        }
    }
}