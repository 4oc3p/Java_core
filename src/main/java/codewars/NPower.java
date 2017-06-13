package codewars;

/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class NPower {

    public static int nthPower(int[] array, int n) {
        try {
            return (int) Math.pow(array[n], n);
        } catch (ArrayIndexOutOfBoundsException e1) {
            return -1;
        }
    }

    public static void main(String[] args) {
        int [] arr = {1, 2};
        System.out.println(nthPower(arr, 2));
    }
}