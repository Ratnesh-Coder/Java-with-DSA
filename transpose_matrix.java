public class transpose_matrix {
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
        for (int i=0; i<transpose.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
}
    public static void main (String args[]) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Transpose Matrix: ");
        for (int i=0; i<matrix.length; i++) {
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        transpose(matrix);
    }
}
