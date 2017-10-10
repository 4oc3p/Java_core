package codewars;


import java.util.Arrays;

/**
 * Created by 4oc3p on 06.07.2017. Java_core
 */
public class HighLow {

    public static String HighAndLow(String numbers) {
        // Code here or
        return String.format("%d %d",
                Arrays.stream(numbers.split(" ")).mapToInt(Integer::valueOf).max().getAsInt(),
                Arrays.stream(numbers.split(" ")).mapToInt(Integer::valueOf).min().getAsInt());
    }

    public static void main(String[] args) {
        System.out.println(HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
