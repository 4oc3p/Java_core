package codewars;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 4oc3p on 13.06.2017. Java_core
 */
public class Keypad {

    private static final List<Character[]> list = Arrays.asList(
            new Character[]{32, 48},  //0
            new Character[]{49},  //1
            new Character[]{97, 98, 99, 50},
            new Character[]{100, 101, 102, 51},
            new Character[]{103, 104, 105, 52},
            new Character[]{106, 107, 108, 53},
            new Character[]{109, 110, 111, 54},
            new Character[]{112, 113, 114, 115, 55},
            new Character[]{116, 117, 118, 56},
            new Character[]{119, 120, 121, 122, 57},
            new Character[]{35},
            new Character[]{42});

    public static int presses(String phrase) {
        int sum = 0;
        for (Character c : phrase.toLowerCase().toCharArray()) {
            for (Character[] ch : list) {
                for (int j = 0; j < ch.length; j++) {
                    if (c.equals(ch[j])) {
                        sum += j + 1;
                    }
                }
            }
        }
        return sum;
    }
}
