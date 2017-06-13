package codewars;

import java.util.Arrays;
import java.util.List;

/**
 * Created by 4oc3p on 13.06.2017. Java_core
 */
public class Keypad {
    private static String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};

    public static int presses(String phrase) {
        int nPresses = 0;

        for (char c : phrase.toUpperCase().toCharArray())
            for (String s : keys)
                nPresses += s.indexOf(c) + 1;
        return nPresses;
    }
}
