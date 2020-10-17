package com.company;

public class IntReverse {

    public int reverse(int x) {
        boolean isNegative = x < 0;

        if(isNegative) {
            x = x * -1;
        }

        int reverse = 0;


        while (x >= 1) {
            int lastDigit = x % 10;
            reverse = reverse * 10 + lastDigit;
            x /= 10;
        }

        return isNegative ? reverse*-1 : reverse;

    }
}
