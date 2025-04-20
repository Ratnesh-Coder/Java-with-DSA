import java.util.*;
public class array_binary_search {
    public static int search(int arr[], int target) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        try {
            int arr[] = {};
            System.out.print("Enter elemnet you want to search: ");
            int target = sc.nextInt();
            int result = search(arr, target);
            if (result == -1) {
            System.out.println("Element not found");
            }
            else {
                System.out.println("Element fount at index: " + result);
            }
        }
        finally {
            sc.close();
        }
    }
}