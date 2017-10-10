package codewars;

/**
 * Created by 4oc3p on 06.07.2017. Java_core
 */
public class Middle {

    public static String getMiddle(String word) {
        return word.length() % 2 == 0 ? word.substring(word.length() / 2, word.length() / 2 + 1)
                : word.substring(word.length() / 2, word.length() / 2 + 1);
    }
}
