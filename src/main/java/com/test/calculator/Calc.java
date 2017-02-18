package com.test.calculator;

import org.apache.commons.lang3.math.NumberUtils;

/**
 * Created by 4oc3p on 10.02.2017. end
 */
public class Calc {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Enter 2 numbers!");
        } else {
            if (NumberUtils.isDigits(args[0]) && NumberUtils.isDigits(args[1])) {
                int sum = Integer.valueOf(args[0]) + Integer.valueOf(args[1]);
                System.out.println("Sum of 2 numbers = " + sum);
            } else {
                System.out.println("Not a number");
            }
        }
    }
}
