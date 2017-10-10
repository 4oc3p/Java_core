package codewars;

import java.util.Arrays;

/**
 * Created by 4oc3p on 04.07.2017. Java_core
 */
public class Sheeps {
        public static int lostSheeps(int[] fridayNightCounting, int[] saturdayNightCounting, int sheepsTotal) {
            return sheepsTotal - (Arrays.stream(fridayNightCounting).sum() + (Arrays.stream(saturdayNightCounting).sum()));
        }
    }
