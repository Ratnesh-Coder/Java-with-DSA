import java.util.*;
public class linear_search {
    public static int LinearSearch (int arr[], int key) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            System.out.print("Enter elements: ");
            int arr [] = new int [5];
            for (int i=0; i<arr.length; i++) {
                arr [i] = sc.nextInt();
            }
            // Print's the Array
            // System.out.print("Array: ");
            // for (int i=0; i<arr.length; i++) {
            //     System.out.print(arr[i] + " ");
            // }
            System.out.print("Enter element you want to search: ");
            int key = sc.nextInt();
            int index = LinearSearch(arr, key);
            if (index == -1) {
                System.out.println("Not found");
            }
            else {
            System.out.println(key + " is at index " + index);
            }
        }
        finally {
            sc.close();
        }
    }
}