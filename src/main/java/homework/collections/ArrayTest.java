package collections;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int size = array.length;
        int[] arrayDest = new int[size + 2];

//        copyWithArraysCopy(array, size);
        System.arraycopy(array, 0, arrayDest, 2, 3);
        System.out.println(Arrays.toString(arrayDest));
    }

    private static void copyWithArraysCopy(int[] array, int size) {
        if(array.length < size + 1){
            array = Arrays.copyOf(array, size+1);
            array[size] = 4;
        }
    }
}
