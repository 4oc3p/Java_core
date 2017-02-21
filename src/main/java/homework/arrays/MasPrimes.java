package homework.arrays;


/**
 * Created by 4oc3p on 21.02.2017. Java_core
 */
public class MasPrimes {
    public static void main(String[] args) {
        int arr[] = new int[20];
        fillArrayWithPrimes(arr, 2);
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
        for (int i = 0; i < arr.length; i++) {
            while (!isPrime(startFromNumber)) {
                startFromNumber++;
            }
            arr[i] = startFromNumber++;
        }
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i:arr) {
            sum += i;
        }
        return sum;
    }


}
