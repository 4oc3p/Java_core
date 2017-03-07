package homework.arrays_2;

import java.util.Arrays;

/**
 * Created by 4oc3p on 07.03.2017. Java_core
 */
public class ArrAddRemove {
    private int[] arr;

    public ArrAddRemove(int[] arr) {
        this.arr = arr;
    }

    public ArrAddRemove(int length) {
        this.arr = new int[length];
    }

    public void add(int num) {
        int[] arr = new int[this.arr.length + 1];
        for (int i = 0; i < this.arr.length; i++) {
            arr[i] = this.arr[i];
        }
        arr[arr.length - 1] = num;
        this.arr = arr;
    }

    public void remove(int index) {
        int arr[] = new int[this.arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (i >= index) {
                arr[i] = this.arr[i + 1];
            } else {
                arr[i] = this.arr[i];
            }
        }
        this.arr = arr;
    }

    @Override
    public String toString() {
        return "ArrAddRemove{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        ArrAddRemove test = new ArrAddRemove(arr);
        test.remove(2);
        test.add(12);
        System.out.println(test);
    }
}
