package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 14.07.2017. Java_core
 */
public class FindShort {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().orElse(0);
    }
}
