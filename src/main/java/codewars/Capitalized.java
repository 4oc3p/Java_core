package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 06.07.2017. Java_core
 */
public class Capitalized {

    public static String toJadenCase(String phrase) {
        if(phrase == null || phrase.length() == 0){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : phrase.split(" ")) {
            char[] chars = s.toCharArray();
            chars[0] = String.valueOf(chars[0]).toUpperCase().charAt(0);
            stringBuilder.append(String.valueOf(chars));
            stringBuilder.append(" ");
        }
        return stringBuilder.delete(stringBuilder.length() - 1, stringBuilder.length()).toString();
    }

    public static void main(String[] args) {
        System.out.println(toJadenCase("most trees are blue"));
    }
}
