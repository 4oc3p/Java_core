package codewars;

/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class AgeDiff {

    public static String CalculateAge(int birth, int yearTo) {
        // TODO: your code here
        int diff = Math.abs(yearTo - birth);
        if (birth > yearTo) {
            return String.format("You will be born in %d year%s.", diff, diff > 1 ? "s" : "");
        } else if (birth < yearTo) {
            return String.format("You are %d year%s old.", diff, diff > 1 ? "s" : "");
        }
        return "You were born this very year!";
    }

    public static void main(String[] args) {
        System.out.println(CalculateAge(1993, 1992));
    }
}
