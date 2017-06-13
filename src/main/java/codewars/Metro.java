package codewars;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class Metro {
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int temp = 0;
        for (int[] i:stops) {
            temp += i[0];
            temp -= i[1];
        }
        return temp;
    }

    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        countPassengers(list);
    }
}

