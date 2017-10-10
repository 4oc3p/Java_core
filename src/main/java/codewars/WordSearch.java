package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 05.07.2017. Java_core
 */
class WordSearch {

    static String[] findWord(String x, String[] y) {
        String[] arr = Arrays.stream(y)
                .filter(a1 -> a1.toLowerCase().contains(x.toLowerCase()))
                .toArray(String[]::new);
        return arr.length > 0 ? arr : new String[]{"Empty"};
    }
}
