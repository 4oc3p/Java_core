package codewars;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by 4oc3p on 13.06.2017. Java_core
 */
public class Keypad {

    private static final Map<Integer, Character[]> map;
    private static final List<Character[]> list = Arrays.asList(
            new Character[]{32, 48},
            new Character[]{49},
            new Character[]{97, 98, 99, 49},
            new Character[]{100, 101, 102, 50},
            new Character[]{103, 104, 105, 51},
            new Character[]{106, 107, 108, 52},
            new Character[]{109, 110, 111, 53},
            new Character[]{112, 113, 114, 115, 54},
            new Character[]{116, 117, 118, 55},
            new Character[]{119, 120, 121, 122, 56},
            new Character[]{35},
            new Character[]{42});

    static {
        map = new HashMap<>();
        map.put(0, new Character[]{32, 48});
        map.put(1, new Character[]{49});
        map.put(2, new Character[]{97, 98, 99, 49});
        map.put(3, new Character[]{100, 101, 102, 50});
        map.put(4, new Character[]{103, 104, 105, 51});
        map.put(5, new Character[]{106, 107, 108, 52});
        map.put(6, new Character[]{109, 110, 111, 53});
        map.put(7, new Character[]{112, 113, 114, 115, 54});
        map.put(8, new Character[]{116, 117, 118, 55});
        map.put(9, new Character[]{119, 120, 121, 122, 56});
        map.put(10, new Character[]{35});
        map.put(11, new Character[]{42});
    }

    public static int presses(String phrase) {
        int sum = 0;
        Set<Integer> arr = map.keySet();
        int min = arr.stream().mapToInt(a -> a).min().getAsInt();
        int max = arr.stream().mapToInt(a -> a).max().getAsInt();
        for (Character c : phrase.toLowerCase().toCharArray()) {
            for (int i = min; i <= max; i++) {
                for (int j = 0; j < map.get(i).length; j++) {
                    if (c.equals(map.get(i)[j])) {
                        sum += j + 1;
                    }
                }
            }
        }
        return sum;
    }
}
