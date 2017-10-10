package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 14.07.2017. Java_core
 */
public class XO {

    public static boolean getXO (String str) {
        str = str.toLowerCase();
        long x = Arrays.stream(str.split("")).filter(a -> a.equals("x")).count();
        long o = Arrays.stream(str.split("")).filter(a -> a.equals("o")).count();
        return x == o;

    }
}
