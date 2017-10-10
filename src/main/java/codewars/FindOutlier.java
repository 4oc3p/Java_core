package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 19.09.2017. Java_core
 */
public class FindOutlier {

    public static void main(String[] args) {
        System.out.println(find(new int[] {160, 3, 1719, 19, 11, 13, -21}));
        System.out.println(Integer.MIN_VALUE % 2);
    }

    static int find(int[] integers) {
        return ((integers[0] + integers[1] + integers[2] % 2) == 0) ?
                Arrays.stream(integers)
                        .filter(a -> a % 2 != 0).findFirst().getAsInt() :
                Arrays.stream(integers)
                        .filter(a -> a % 2 == 0).findFirst().getAsInt() ;
    }
}
