package org.example;

import java.util.Arrays;

/*
    PROBLEM 14
    Problem Description
    Write a function to find the longest common prefix string amongst an array of strings.
    If there is no common prefix, return an empty string "".
*/
public class LongestCommonPrefix {

    //1ms 62.17%
    public static String solution(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < strs[0].length(); i++) {
            char verify = strs[0].charAt(i);
            if(verify == strs[strs.length - 1].charAt(i)) {
                result.append(verify);
            } else {
                return result.toString();
            }
        }
        return result.toString();
    }

}
