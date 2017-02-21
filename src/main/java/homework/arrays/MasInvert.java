package homework.arrays;

import java.util.Arrays;

/**
 * Created by 4oc3p on 21.02.2017. Java_core
 */
public class MasInvert {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        arrInvert(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void arrInvert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[arr.length - (1 + i)];
            arr[arr.length - (1 + i)] = arr[i];
            arr[i] = temp;
        }
    }
}
