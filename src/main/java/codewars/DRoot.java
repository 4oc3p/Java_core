package codewars;

/**
 * Created by 4oc3p on 19.09.2017. Java_core
 */
public class DRoot {
    public static int digital_root(int n) {
        // ...
        if(n < 10){
            return 1;
        }
        int sum = 0;
        for (int i = n; i > 0; i /= 10){
            sum += i % 10;
        }
        return digital_root(sum) + 1;
    }
}