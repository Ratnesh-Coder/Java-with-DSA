import java.util.*;
public class array_pairs {
    public static void pairs(int arr[]) {
        int tp = 0;
        for (int i=0; i<arr.length; i++) {
            int current = arr[i];
            for (int j=i+1; j<arr.length; j++) {
                System.out.print("(" + current + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.print("Total pairs: " + tp);
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int arr[] = new int [5];
            for (int i=0; i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            pairs(arr);
        }
        finally {
            sc.close();
        }
    }
}