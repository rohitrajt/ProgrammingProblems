package com.rohit.string;

/**
 */
public class Palindrome {

    public static boolean isPalindrome(int num) {
        if (num < 0) {
            return false;
        }

        int div = 1;
        while (num / div >= 10) {
            div *= 10;
        }

        while (num != 0) {
            int left = num / div;
            int right = num % 10;

            if (left != right) {
                return false;
            }

            num = (num % div) / 10;
            //since we removed 2 digits, div is to be divided by 100
            div /= 100;
        }

        return true;
    }
}
