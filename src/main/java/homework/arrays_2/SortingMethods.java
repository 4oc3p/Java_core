package homework.arrays_2;


import java.util.Arrays;

/**
 * Created by 4oc3p on 03.03.2017. Java_core
 */
public class SortingMethods {
    private int arr[];

    public SortingMethods(int[] arr) {
        this.arr = arr;

    }

    public SortingMethods(int arrLen, int randMax) {
        this.arr = new int[arrLen];
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = (int) (Math.random() * randMax + 1);
        }
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public String toString() {
        return "SortingMethods{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public void bubbleSort() {
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) break;
        }
    }

    public void bubbleSortTwoWay() {
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = false;
            for (int j = i; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = true;
                }
            }
            for (int j = arr.length - i - 2; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) break;
        }
    }

    public void evenOddSort() {
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = false;
            for (int j = 0; j < arr.length - 1; j = j + 2) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = true;
                }
            }
            for (int j = 1; j < arr.length - 1; j = j + 2) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) break;
        }
    }

    public void combSort() {
        float num = 1.247f;
        int len = Math.round(arr.length / num);
        for (int i = 0; i < arr.length; i++) {
            boolean isSorted = false;
            for (int j = 0; j < arr.length - len; j++) {
                if (arr[j] > arr[len + j]) {
                    int temp = arr[len + j];
                    arr[len + j] = arr[j];
                    arr[j] = temp;
                    isSorted = true;
                }
            }
            if (!isSorted) break;
            len /= num;
            if (len < 1) len = 1;
        }
    }
}
