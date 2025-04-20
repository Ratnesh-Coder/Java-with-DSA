import java.util.*;
public class array_reverse {
    public static int[] reverse(int arr[]) {
        int new_arr[] = new int [arr.length];
        for (int i=arr.length-1, j=0; i>=0; i--, j++) {
            new_arr[j] = arr[i];
        }
        return new_arr;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int arr[] = new int [5];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.print("Array is: ");
            for (int i=0; i<arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            int rev_arr[] = reverse(arr);
            System.out.print("Reversed array is: ");
            for (int i=0; i<rev_arr.length; i++) {
                System.out.print(rev_arr[i] + " ");
            }
        }
        finally {
            sc.close();
        }
    }
}