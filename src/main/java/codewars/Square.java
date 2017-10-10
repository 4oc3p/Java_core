package codewars;

/**
 * Created by 4oc3p on 14.07.2017. Java_core
 */
public class Square {
    public static boolean isSquare(int n) {
        return Math.sqrt(n) % 1 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isSquare(19));
    }
}
