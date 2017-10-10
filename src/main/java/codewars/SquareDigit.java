package codewars;


/**
 * Created by 4oc3p on 13.07.2017. Java_core
 */
public class SquareDigit {

    public int squaredigits(int n) {
        // TODO Implement me
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i > 0; i /= 10){
            stringBuilder.insert(0, (int) Math.pow(i % 10, 2));
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
