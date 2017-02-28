package homework.arrays_2;

import java.util.Arrays;

/**
 * Created by 4oc3p on 28.02.2017. Java_core
 */
public class SwapMinMax {
    public static void main(String[] args) {
        int[] arr = {3, 4, 15, 33, 7, 2, 8, 7, 10, 21};
        System.out.println(Arrays.toString(arr));
        swapMinMax(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapMinMax(int[] arr) {
        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if (arr[minIndex] > arr[i]) {
                minIndex = i;
            }
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
    }
}
