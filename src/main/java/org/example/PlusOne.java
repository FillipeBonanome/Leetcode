package org.example;

import java.util.ArrayList;
import java.util.Arrays;

/*
    PROBLEM 66
    Problem description:
    You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
    The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
    Increment the large integer by one and return the resulting array of digits.
 */
public class PlusOne {

    public static int[] Solution(int[] digits) {
        //Loop from the end to the start of the array
        for(int i = digits.length - 1; i >= 0; i--) {
            //If the digit is different than 9, just add a number and return digits
            //This loop will continue to check other values until the first digit if necessary
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            //Otherwise digits[i] will be zero
            digits[i] = 0;
        }

        //If the value is not returned in the for loop, it means the first digit was a nine, so we need to add a digit and make the first digit one
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

}
