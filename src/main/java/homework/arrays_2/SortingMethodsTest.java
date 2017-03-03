package homework.arrays_2;


import java.util.Arrays;

/**
 * Created by 4oc3p on 03.03.2017. Java_core
 */
public class SortingMethodsTest {
    public static void main(String[] args) {


        SortingMethods test1 = new SortingMethods(30000, 50000);
        int arr[] = test1.getArr().clone();
        long a1 = System.currentTimeMillis();
//        System.out.println(test1);
        test1.combSort();
//        System.out.println(test1);
//        Arrays.sort(arr);
//        System.out.println(Arrays.equals(test1.getArr(), arr));

        long a2 = System.currentTimeMillis();
        System.out.println(a2 - a1);
    }
}
