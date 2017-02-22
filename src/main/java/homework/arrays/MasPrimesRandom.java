package homework.arrays;


import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

/**
 * Created by 4oc3p on 21.02.2017. Java_core
 */
public class MasPrimesRandom {
    public static void main(String[] args) {
        int arr[] = new int[20];
        fillArrayWithPrimes(arr, 2);
        System.out.println(Arrays.toString(arr));
        System.out.println(sumOfArray(arr));
    }

    public static boolean isPrime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void fillArrayWithPrimes(int[] arr, int startFromNumber) {
        int arrTemp[] = new int[arr.length];
        for (int i = 0; i < arrTemp.length; i++) {
            arrTemp[i] = i;
        }
        for (int i = 0; i < arr.length; i++) {
            while (!isPrime(startFromNumber)) {
                startFromNumber++;
            }
            int a = arrTemp[(int) (Math.random() * arrTemp.length)];
            arr[a] = startFromNumber++;
            arrTemp = ArrayUtils.removeElements(arrTemp, a);
        }
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }


}
