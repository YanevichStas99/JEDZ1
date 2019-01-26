package com.company;

import java.util.Arrays;

public class Time {
    protected static String time(String time) {
        String[] ss = time.split("\\s+");
        String[] s1 = ss[0].split("\\.");
        String[] s2 = ss[1].split(":");
        Month month = chooseMonth(s1[1]);
        String day = s1[0];
        int hours = Integer.valueOf(s2[0]);
        String pmOrAm;
        if (hours > 12) {
            hours = hours - 12;
            pmOrAm = "PM";
        } else {
            pmOrAm = "AM";
        }
        String minutes = s2[1];
        String result = day + " " + month + ", " + hours + ":" + minutes + " " + pmOrAm;
        int data=Integer.valueOf(s1[0]);
        if (data>33){
            result="Wrong data";
        }
        return result;
    }

    protected static Month chooseMonth(String month) {
        Month m = Month.August;
        if (month.equals("01")) {
            m = Month.January;
        }
        if (month.equals("02")) {
            m = Month.February;
        }
        if (month.equals("03")) {
            m = Month.March;
        }
        if (month.equals("04")) {
            m = Month.April;
        }
        if (month.equals("05")) {
            m = Month.May;
        }
        if (month.equals("06")) {
            m = Month.June;
        }
        if (month.equals("07")) {
            m = Month.July;
        }
        if (month.equals("08")) {
            m = Month.August;
        }
        if (month.equals("09")) {
            m = Month.September;
        }
        if (month.equals("10")) {
            m = Month.Oktober;
        }
        if (month.equals("11")) {
            m = Month.November;
        }
        if (month.equals("11")) {
            m = Month.December;
        }
        return m;
    }
}
