public class TransposeMatrix {
    public static void transpose (int[][] matrix) {
        int[][] transpose = new int[matrix.length][matrix[0].length];
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
                // matrix[i][j] = matrix[j][i] ^ matrix[i][j];
                // matrix[j][i] = matrix[j][i] ^ matrix[i][j];
                // matrix[i][j] = matrix[j][i] ^ matrix[i][j];
            }
        }
        System.out.println("Tanspose Matrix: ");
        for (int[] row : transpose) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
}
    public static void main (String args[]) {
        int[][] matrix = {{1, 2, 3}, 
                          {4, 5, 6}, 
                          {7, 8, 9}};
        System.out.println("Transpose Matrix: ");
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
        transpose(matrix);
    }
}
