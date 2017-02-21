package homework.arrays;

/**
 * Created by 4oc3p on 21.02.2017. Java_core
 */
public class NumbersIntersection {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {5, 4, 7, 2, 9, 2, 2, 1};
        printSameNumbers(arr1, arr2);
    }

    public static void printSameNumbers(int[] arr1, int[] arr2) {
        System.out.printf("Intersected numbers: ");
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
