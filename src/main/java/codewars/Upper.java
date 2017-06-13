package codewars;


/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class Upper {

    public static String MakeUpperCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 96 && chars[i] < 123 || chars[i] > 1071 && chars[i] < 1104) {
                chars[i] -= 32;
            } else if (chars[i] > 64 && chars[i] < 91 || chars[i] > 1039 && chars[i] < 1072){
                chars[i] += 32;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        String s = "привет";
        System.out.println(MakeUpperCase(s));
    }
}
