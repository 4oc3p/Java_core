package codewars;

/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class RepeatString {

    public static String repeatStr(final int repeat, final String string) {
        String temp = "";
        for (int i = 0; i < repeat; i++){
            temp += string;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(6, "qwe"));
    }
}
