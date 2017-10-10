package codewars;


import java.util.Arrays;

/**
 * Created by 4oc3p on 04.07.2017. Java_core
 */
public class SectionalArray {
    static int[] sort(final int[] array, final int start, final int... length) {
        int[] temp;
        if (array.length == 0) {
            return array;
        }
        try {
            if (length != null && length.length > 0) {
                temp = new int[length[0]];
                System.arraycopy(array, start, temp, 0, length[0]);
            } else {
                temp = new int[array.length - start];
                System.arraycopy(array, start, temp, 0, array.length - start);
            }
            temp = Arrays.stream(temp).sorted().toArray();
            System.arraycopy(temp, 0, array, start, temp.length);
            return array;
        } catch (IndexOutOfBoundsException e1) {
            return array;
        }
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{1, 2, 5, 7, 4, 6, 3, 9, 8}, 8, 3)));
    }
}
