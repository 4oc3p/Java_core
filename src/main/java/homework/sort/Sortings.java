package homework.sort;

/**
 * Created by 4oc3p on 18.09.2017. Java_core
 */
public class Sortings {

    public static int[] bubbleSort(int[] arr) {
        boolean swapped = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] > arr[j]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            if (index == i) {
                continue;
            }
            swap(arr, i, index);
        }
        return arr;
    }

    public static int[] combSort(int[] arr) {
        int gap = arr.length;
        boolean swapped = false;
        while (gap > 1 || swapped) {
            if (gap > 1) {
                gap = (int) (gap / 1.247);
            }
            swapped = false;
            for (int i = 0; i < arr.length - gap; i++) {
                if (arr[i] > arr[i + gap]) {
                    swap(arr, i, i + gap);
                    swapped = true;
                }
            }
        }
        return arr;
    }

    public static void swap2(int[] arr, int index1, int index2) {
        arr[index1] ^= arr[index2];
        arr[index2] ^= arr[index1];
        arr[index1] ^= arr[index2];
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
