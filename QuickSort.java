import java.util.*;
public class QuickSort {
    public static void main(String args[]) {
        InputHandler input = new InputHandler();
        int[] arr = input.getInput();

        QuickSortLogic s = new QuickSortLogic();
        s.quickSort(arr, 0, arr.length - 1);

        PrintArray print = new PrintArray();
        print.printArray(arr); 
    }
}
class InputHandler {
    int[] getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();
        System.out.print("Enter elements of the array: ");

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
class PrintArray {
    void printArray(int[] arr) {
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
class Swap {
    void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
class Partition {
    Swap s = new Swap();
    int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                s.swap(arr, i, j);
            }
        }
        i++;
        s.swap(arr, i, end);
        return i;
    }
}
class QuickSortLogic {
    Partition part = new Partition();
    void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot = part.partition(arr, start, end);
            quickSort(arr, start, pivot - 1);
            quickSort(arr, pivot + 1, end);
        }
    }
}