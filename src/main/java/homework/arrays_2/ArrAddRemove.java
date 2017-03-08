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
        int[] tempArr = new int[this.arr.length + 1];
        for (int i = 0; i < this.arr.length; i++) {
            tempArr[i] = this.arr[i];
        }
        tempArr[tempArr.length - 1] = num;
        this.arr = tempArr;
    }

    public void add2(int num) {
        int[] tempArr = Arrays.copyOf(this.arr, this.arr.length + 1);
        tempArr[tempArr.length - 1] = num;
        this.arr = tempArr;
    }


    public void remove(int index) {
        int tempArr[] = new int[this.arr.length - 1];
        for (int i = 0; i < tempArr.length; i++) {
            if (i >= index) {
                tempArr[i] = this.arr[i + 1];
            } else {
                tempArr[i] = this.arr[i];
            }
        }
        this.arr = tempArr;
    }

    public void remove2(int index) {
        int tempArr[] = Arrays.copyOf(this.arr, this.arr.length - 1);
        System.arraycopy(this.arr, index + 1, tempArr, index, tempArr.length - index);
        this.arr = tempArr;
    }

    @Override
    public String toString() {
        return "ArrAddRemove{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        ArrAddRemove test = new ArrAddRemove(arr1);
//        test.remove(4);
        test.remove2(4);
//        test.add(12);
        test.add2(12);
        System.out.println(test);
    }
}
