package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class FindOddCubes {

    public static int cubeOdd(int arr[]) {
        return Arrays.stream(arr)
                .map(i -> (int) Math.pow(i, 3))
                .filter(i -> i % 2 != 0)
                .sum();
//        int sum = 0;
//        for (int i : arr) {
//            if (i % 2 != 0) {
//                sum += (int) Math.pow(i, 3);
//            }
//        }
//        return sum;
    }

}
