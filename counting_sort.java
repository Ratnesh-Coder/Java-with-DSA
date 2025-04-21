import java.util.*;
public class counting_sort {
    public static void counting (int[] arr, int n) {
        int max = arr[0];
        for (int i=0; i<n; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] count = new int[max+1];
        for (int i=0; i<n; i++) {
            count[arr[i]]++;
        }
        int j = 0;
        for (int i=0; i<count.length; i++) {
            while (count[i] > 0) {
            arr[j] = i;
            j++;
            count[i]--;
            }
        }
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter size of array: ");
            int n = sc.nextInt();
            System.out.print("Enter elements: ");
            int[] arr = new int[n];
            for (int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            counting(arr, n);
            for (int i=0; i<n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
        finally {
            sc.close();
        }
    }
}