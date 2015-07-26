package com.rohit.string;

public class StringConversions {

    public static int strToInt(String input) {

        boolean negative = false;

        int num = 0;

        int length = input.length();

        int start = 0;

        if (input.charAt(0) == '-') {
            negative = true;
            start = 1;
        }

        for (int i = start; i < length; i++) {
            num *= 10;

            int digit = input.charAt(i) - '0';

            num += digit;
        }

        if (negative) {
            num *= -1;
        }

        return num;
    }

    public static void intToStr(int num) {
        StringBuffer temp = new StringBuffer();

        boolean negative = false;
        if (num < 0) {
            num *= -1;
            negative = true;
        }

        while (num > 0) {
            temp.append((num % 10));

            num /= 10;
        }

        StringBuffer result = new StringBuffer();

        if (negative) {
            result.append("-");
        }
        System.out.println(result.append(temp.reverse().toString()).toString());
    }
}
