package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class RemoveExclMarks {
    static String removeExclamationMarks(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++){
            if (chars[i] == 33){
                System.arraycopy(chars, i + 1, chars, i, chars.length - i - 1);
                char[] temp = new char[chars.length-1];
                System.arraycopy(chars, 0, temp, 0, chars.length - 1);
                chars = temp;
                i--;
            }
        }
        return String.valueOf(chars);
    }

    public static void main(String[] args) {
        System.out.println(removeExclamationMarks("qwe!fgg!!ggg!"));
    }
}
