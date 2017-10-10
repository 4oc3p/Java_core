package homework.sort;

import java.util.Arrays;

/**
 * Created by 4oc3p on 18.09.2017. Java_core
 */
public class SortTest {

    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 1000) + 1);
        }
//        long start1 = System.currentTimeMillis();
//        for (int i = 0; i < arr.length - 1; i++) {
//            Sortings.swap(arr, i, i + 1);
//        }
//        long end1 = System.currentTimeMillis();
//
//        long start2 = System.currentTimeMillis();
//        for (int i = 0; i < arr.length - 1; i++) {
//            Sortings.swap2(arr, i, i + 1);
//        }
//        long end2 = System.currentTimeMillis();
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        long start1 = System.currentTimeMillis();
        Arrays.sort(arr2);
        long end1 = System.currentTimeMillis();
        long start2 = System.currentTimeMillis();
        int[] arr1 = Sortings.combSort(arr);
        long end2 = System.currentTimeMillis();
        System.out.println(Arrays.equals(arr1, arr2));
        System.out.println(end1 - start1);
        System.out.println(end2 - start2);
    }

}
