package com.example.testproject.codingTest;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hh = sc.nextInt();
        int mm = sc.nextInt();

        System.out.println(changeAlarm(hh,mm));

    }

    static String changeAlarm(int hh, int mm) {

        final int MINUTE = 45;
        int hour;

        if (mm-MINUTE >= 0) {
            return String.valueOf(hh) + " " + String.valueOf(mm-MINUTE);
        }

        hour = hh-1;

        if (hour < 0) {
            hour = 23;
        }

        return String.valueOf(hour) + " " + String.valueOf(60-Math.abs(mm-MINUTE));
    }
}
