public class sorting {

    public static void bubbleSort(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int swap = 0;
            for (int j=0; j<arr.length-1-i; j++) {
                if (arr[j] < arr[j+1]) {
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

    public static void selectionSort (int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            int min = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (min != i ) {
                arr[min] = arr[min] ^ arr[i];
                arr[i] = arr[min] ^ arr[i];
                arr[min] = arr[min] ^ arr[i];
            }
        }
    }

    public static void insertionSort (int[] arr) {
        for (int i=0; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            while (prev >=0 && curr <= arr[prev]) {
               arr[prev+1] = arr[prev];
               prev--;
            }
            arr[prev+1] = curr;
        }
    }

    public static void countingSort (int[] arr) {
        int max = arr[0];
        for (int i=0; i<arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        int[] count = new int[max+1];
        for (int i=0; i<arr.length; i++) {
            count[arr[i]]++;
        }
        
    }
    public static void main (String args[]) {
        int[] arr = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr);
        for (int i=0; i<arr.length; i++)
        System.out.print(arr[i]);
        System.out.println();

        selectionSort(arr);
        for (int i=0; i<arr.length; i++)
        System.out.print(arr[i]);
        System.out.println();

        insertionSort(arr);
        for (int i=0; i<arr.length; i++)
        System.out.print(arr[i]);
    }
}
