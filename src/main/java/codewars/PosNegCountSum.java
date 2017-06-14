package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 4oc3p on 13.06.2017. Java_core
 */
public class PosNegCountSum {

    public static int[] countPositivesSumNegatives(int[] input) {
        return input != null && input.length != 0 ? new int[]{
                (int) Arrays.stream(input).filter(a -> a > 0).count(),
                (int) Arrays.stream(input).filter(a -> a < 0).sum()
        }
                : new int[0];
    }
}
