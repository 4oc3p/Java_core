package homework.matrix;

import java.util.Arrays;

/**
 * Created by 4oc3p on 24.02.2017. Java_core
 */
public class MultiplyMatrix {
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{1, 2}, {3, 4}, {5, 6}};
        int[][] resultMatrix = matrixMultiply(matrix1, matrix2);
        for (int[] arr : resultMatrix) {
            System.out.println(Arrays.toString(arr));
        }

    }


    public static int[][] matrixMultiply(int[][] m1, int[][] m2) {
        int[][] result = new int[m1.length][m2[0].length];
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m2[0].length; j++) {
                for (int k = 0; k < m2.length; k++) {
                    result[i][j] += m1[i][k] * m2[k][j];
                }
            }

        }
        return result;
    }
}
