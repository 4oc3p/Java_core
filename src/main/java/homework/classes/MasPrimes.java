package homework.classes;


/**
 * Created by 4oc3p on 19.02.2017. Java_core
 */
public class MasPrimes {
    public static void main(String[] args) {
        int[] evenNumbers = new int[20];
        fillArray(evenNumbers);
        for (int i = 0; i < evenNumbers.length; i++){
            System.out.print(evenNumbers[i] + " ");
        }
        System.out.println("\nSum of array digits: " + arraySum(evenNumbers));

    }

    public static void fillArray(int[] a) {
        for (int i = 0; i < a.length; i++){
            a[i] = prime();
        }
    }

    public static int prime() {
        int rand = (int) (Math.random() * 99) + 1;
        for (int i = 2; i <= rand / 2; i++) {
            if ((rand % i) == 0) {
                rand = (int) (Math.random() * 99) + 1;
                i = 1;
            }
        }
        return rand;
    }

    public static int arraySum(int []a){
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i];
        }
        return sum;
    }
}