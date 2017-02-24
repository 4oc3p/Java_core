package homework.matrix;

import java.util.Arrays;

/**
 * Created by 4oc3p on 23.02.2017. Java_core
 */
public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int[][] transposedMatrix = transposeMatrix(matrix);
        System.out.println("Начальная матрица:");
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("Транспонированная матрица:");
        for (int[] arr : transposedMatrix) {
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int matrixColumns(int[][] matrix) {
        int max = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > max) {
                max = matrix[i].length;
            }
        }
        return max;
    }


    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] tempMatrix = new int[matrixColumns(matrix)][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                tempMatrix[j][i] = matrix[i][j];
            }
        }
        return tempMatrix;
    }


}
