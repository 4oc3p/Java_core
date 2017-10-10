package codewars;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Created by 4oc3p on 19.09.2017. Java_core
 */
public class SpinWords {

    public static void main(String[] args) {
        System.out.println(spinWords("Hey fellow warriors"));

    }

    public static String spinWords(String sentence) {
        //TODO: Code stuff here
        return Arrays.stream(sentence.split(" "))
                .map(a -> a.length() > 4 ? new StringBuilder(a).reverse().toString() : a)
                .collect(Collectors.joining(" "));
    }
}
