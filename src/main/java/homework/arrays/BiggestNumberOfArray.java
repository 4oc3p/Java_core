package homework.arrays;

import java.util.Arrays;

/**
 * Created by 4oc3p on 21.02.2017. Java_core
 */
public class BiggestNumberOfArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 2, 7, 8, 1, 11, 8};
        printBiggestNumber(arr);
    }

    public static void printBiggestNumber(int[] arr) {
        int biggest = arr[0];
        for (int i : arr) {
            if (i > biggest) {
                biggest = i;
            }
        }
        System.out.printf("The biggest number of array: %s is: %d", Arrays.toString(arr), biggest);
    }
}
