package codewars;

/**
 * Created by 4oc3p on 19.09.2017. Java_core
 */
public class EqualsHalfArray {

    public static void main(String[] args) {
        findEvenIndex(new int[] {1,2,3,4,3,2,1});
    }

    public static int findEvenIndex(int[] arr) {
        // your code
        for(int i = 0; i < arr.length; i++){
            int leftSum = 0;
            int rightSum = 0;
            for (int j = 0; j < i; j++){
                leftSum += arr[j];
            }
            for (int k = i + 1; k < arr.length; k++){
                rightSum += arr[k];
            }
            if (leftSum == rightSum) return i;
        }
        return 0;
    }

}
