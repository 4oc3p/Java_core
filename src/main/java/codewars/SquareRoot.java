package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class SquareRoot {

    public static int[] squareOrSquareRoot(int[] array) {
        return Arrays.stream(array)
                .map(a -> Math.sqrt(a) % 1 == 0 ? (int)Math.sqrt(a) : (int)a*a)
                .toArray();
    }

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(squareOrSquareRoot(arr)));
    }
}