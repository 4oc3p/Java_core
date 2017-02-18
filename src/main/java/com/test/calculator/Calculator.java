package com.test.calculator;

import java.util.Scanner;

/**
 * Created by 4oc3p on 14.02.2017. end
 */
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 - binary, 2 - octal, 3 - hexadecimal");
        int system = 0;
        if (scanner.hasNextInt()) {
            system = scanner.nextInt();
            while (system < 1 || system > 3) {
                System.out.println("Wrong choice");
                if (scanner.hasNextInt()) {
                    system = scanner.nextInt();
                }
            }
        }
        System.out.println("Enter first number");
        String first = scanner.next();
        System.out.println("Enter second number");
        String second = scanner.next();
        System.out.println("Result: " + result(first, second, system));

    }

    private static int result(String a, String b, int c) {
        int radix = c == 1 ? 2 : c == 2 ? 8 : 16;
        int firstNum = Integer.parseInt(a, radix);
        int secondNum = Integer.parseInt(b, radix);
        return firstNum + secondNum;
    }
}
