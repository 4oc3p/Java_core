package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 19.09.2017. Java_core
 */
public class Xbonacci {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(tribonacci(new double[]{0, 1, 1}, 100)));
    }

    public static double[] tribonacci(double[] s, int n) {
        // hackonacci me
        double[] s2 = Arrays.copyOf(s, n);
//        for (int i = 0; i < n; i++) {
//            if (i > s.length - 1) {
//                s2[i] = Arrays.stream(s2).skip(i - s.length).sum();
//            }
//        }
        for (int i = 3; i < n; i++) {
            s2[i] = s2[i - 1] + s2[i - 2] + s2[i - 3];
        }
        return s2;
    }
}
