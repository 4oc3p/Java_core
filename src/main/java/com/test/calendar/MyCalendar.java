package com.test.calendar;

import org.joda.time.DateTime;

/**
 * Created by 4oc3p on 10.02.2017. end
 */
public class MyCalendar {
    public static void main(String[] args) {
        DateTime date = DateTime.now();
        int hour = date.getHourOfDay();
        System.out.println(date);
        System.out.println("Now is " + hour);
        if (hour >= 9 && hour <= 19) {
            System.out.println("Good day");
        } else if (hour > 5 && hour < 9) {
            System.out.println("Good morning");
        } else {
            System.out.println("Good night");
        }
    }
}
