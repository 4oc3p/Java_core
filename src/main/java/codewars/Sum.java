package codewars;

/**
 * Created by 4oc3p on 13.07.2017. Java_core
 */
public class Sum {

    public static int getSum(int a, int b) {
        int sum = 0;
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            sum += i;
        }
        return sum;
    }
}
