package codewars;

/**
 * Created by 4oc3p on 18.09.2017. Java_core
 */
public class Persist {

    public static void main(String[] args) {

    }

    public static int persistence(long n) {
        // your code
        int res = 1;
        int attempts = 0;
        if(n < 10){
            return 0;
        }
        while (n > 9){
            while (n > 0) {
                res *= n % 10;
                n /= 10;
            }
            n = res;
            res = 1;
            attempts++;
        }
        return attempts;
    }
}
