package codewars;

/**
 * Created by 4oc3p on 04.07.2017. Java_core
 */
public class TGG {

    public static String find_E(String str) {
        if (str == null) {
            return null;
        }

        if (str.isEmpty()) {
            return str;
        }
        int sum = 0;
        for (Character c : str.toLowerCase().toCharArray()) {
            if (c.equals('e')) {
                sum++;
            }
        }
        return sum > 0 ? Integer.toString(sum) : "There is no \"e\"";
    }
}
