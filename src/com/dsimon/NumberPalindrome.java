package com.dsimon;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int numberToReverse = number;

        while (numberToReverse != 0) {
            reverse *= 10;
            reverse += numberToReverse % 10;
            numberToReverse /= 10;
        }

        if (reverse == number) {
            return true;
        }
        return false;
    }
}
