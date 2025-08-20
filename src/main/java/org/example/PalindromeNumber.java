package org.example;

/*  -------------------------------------------------------------------------------------------------------------------------
    PROBLEM 09
    Problem Description:
    Given an integer x, return true if x is a palindrome, and false otherwise.
    -------------------------------------------------------------------------------------------------------------------------
 */

public class PalindromeNumber {

    //Runtime: 7ms 13.73%
    public static boolean SolutionUsingStrings(int x) {
        if (x < 0) { return false; }
        String xString = String.valueOf(x);
        for(int i = 0; i < Math.floor((double) xString.length() / 2); i++) {
            if (xString.charAt(i) != xString.charAt(xString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Runtime 4ms 100%
    public static boolean SolutionWithRemainder(int x) {
        if (x < 0) { return false; }

        int reverse = 0;
        int copy = x;

        while(x > 0) {
            reverse = (reverse * 10) + (x % 10);
            x = x / 10;
        }

        return reverse == copy;
    }

}
