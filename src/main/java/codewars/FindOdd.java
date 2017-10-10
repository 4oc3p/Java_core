package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 4oc3p on 17.09.2017. Java_core
 */
public class FindOdd {

    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 2, 3, 4, 18, 5, 1, 2, 3, 4, 5, 6, 7, 6, 7}));
    }

    public static int findIt(int[] arr) {
        try {
            return Arrays.stream(arr).reduce((x, y) -> x ^ y).getAsInt();
        } catch (Exception e) {
            return 0;
        }
//        Map<Integer, Integer> map = new HashMap<>();
//
//        for (int i:arr) {
//            map.putIfAbsent(i, 0);
//            map.put(i, map.get(i) + 1);
//        }
//
//        return map.entrySet().stream().filter(a -> a.getValue() % 2 != 0).findFirst().get().getKey();
//    }
    }
}
