package codewars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Created by 4oc3p on 06.07.2017. Java_core
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        //Your code
//        List<Integer> arr = new ArrayList<>();
//        for (int i = num; i > 0 ; i /= 10) {
//            arr.add(i % 10);
//        }
        return Integer.parseInt(Arrays.stream(String.valueOf(num).split("")).sorted(Comparator.reverseOrder()).collect(
                Collectors.joining()));
//        return arr.stream().sorted(Comparator.reverseOrder()).reduce((a1, a2) -> Integer.parseInt(a1.toString() + a2.toString())).orElse(0);
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(0));
    }
}
