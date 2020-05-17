package com.company;

/**
 * https://www.java67.com/2015/08/how-to-reverse-integer-in-java-leetcode-solution.html
 * Reverse Integer
 */

public class ReverseInteger {
    public static void main(String[] args) {
        int input  = 5678;
        int output = reverseInteger(5678);
        System.out.println( input);
        System.out.println( output);
    }

   public static int reverseInteger(int number){
        boolean isNegative = number < 0;
        if (isNegative) {
            number = number * - 1;
        }
        int reverse = 0;
        int lastDigit = 0;

        while (number >= 1) {
            lastDigit = number % 10;
            reverse = reverse *10 + lastDigit;
            number = number /10;
        }

        return isNegative ? reverse*-1 : reverse;
    }
}
