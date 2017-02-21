package homework.arrays;

import java.util.Scanner;

/**
 * Created by 4oc3p on 19.02.2017. Java_core
 */
public class NumberEvenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0, digitCount = 0;
        while (number == 0 || digitCount == 0) {
            System.out.println("Enter number: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
            }
            System.out.println("Enter digit count: ");
            if (scanner.hasNextInt()) {
                digitCount = scanner.nextInt();
            }
        }
        System.out.println("Sum of even digits: " + sumOfDigits(number, digitCount));
    }

    public static int sumOfDigits(int number, int dig) {
        int sum = 0;
        for (int i = dig; i > 0; i--) {
            int lastDig = number % 10;
            if (lastDig % 2 == 0) {
                sum += lastDig;
            }
            number /= 10;
        }
        return sum;
    }
}
