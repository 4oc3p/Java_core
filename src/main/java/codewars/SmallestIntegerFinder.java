package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 04.07.2017. Java_core
 */
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }
}