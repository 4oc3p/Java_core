package codewars;

/**
 * Created by 4oc3p on 09.06.2017. Java_core
 */
public class FirstNonConsecutive {

    static Integer find(final int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] + 1 != array[i + 1]) {
                return array[i + 1];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 10};
        System.out.println(find(ints));
    }
}
