public class array_left_rotate {
    public static void rotateOnce (int[] arr, int rotate) {
        int temp = arr[0];
        for (int i=0; i<arr.length-1; i++) {
                arr[i] = arr[i+1];
        }
            arr[arr.length-1] = temp;
    }
    public static void LeftRotate (int[] arr, int rotate) {
        for (int i=0; i<rotate; i++) {
            rotateOnce(arr, rotate);
        }
    }
    public static void main (String args[]) {
        int[] arr = {1, 2, 3, 4, 5};
        int rotate = 2;
        LeftRotate(arr, rotate);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}
