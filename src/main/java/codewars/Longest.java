package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 04.07.2017. Java_core
 */
public class Longest {
    public static String longestWord(String wordString) {
        String[] arr = wordString.split(" ");
        int len = arr[0].length();
        String str = arr[0];
        for (String s:arr) {
            if(s.length() >= len){
                str = s;
                len = s.length();
            }
        }
        return str;
//        return Arrays.stream(wordString.split(" "))
//                .reduce((s, s2) -> s.length() > s2.length() ? s : s2)
//                .get();
    }

    public static void main(String[] args) {
        System.out.println(longestWord("a b c d e fgh"));
    }
}
