package homework.arrays_2;

import java.util.Arrays;

/**
 * Created by 4oc3p on 28.02.2017. Java_core
 */
public class SortAscDesc {
    public static void main(String[] args) {
        int[][] arr = {{5, 3, 2, 8}, {7, 2, 5, 1}, {2, 8, 1, 5}, {4, 6, 7, 9}};
        printMatrix(arr);
        sortColumns(arr);
        printMatrix(arr);
    }

    public static void sortColumns(int[][] arr) {
        int len = arr.length;
        for (int i = 0; i < arr[0].length; i++) {
            int temp[] = new int[len];
            for (int j = 0; j < len; j++) {
                temp[j] = arr[j][i];
            }
            Arrays.sort(temp);
            if (i % 2 == 0) {
                for (int j = 0; j < len; j++) {
                    arr[j][i] = temp[j];
                }
            } else {
                for (int j = len - 1; j >= 0; j--) {
                    arr[j][i] = temp[(len - 1) - j];
                }
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            System.out.println(Arrays.toString(arr));
        }
        System.out.println();
    }
}
