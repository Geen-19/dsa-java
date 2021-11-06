package arrays.arrays;

public class Matrix_Diagonal_Sum {
    public int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        int p = 0;
        int k = matrix.length - 1;
        while (p <= matrix.length - 1) {
            if (p == k) {
                sum = sum - matrix[p][k];
            }
            sum = sum + matrix[p][k];
            p = p + 1;
            k = k - 1;
        }
        return sum;
    }
}