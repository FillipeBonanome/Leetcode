package org.example;

import javax.xml.transform.Source;

/*
    PROBLEM 28
    PROBLEM DESCRIPTION
    Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/
public class FindTheIndexOfTheFirstOccurrenceInAString {

    //1ms 19.65%
    public static int Solution(String haystack, String needle) {
        int index = 0;
        int corrects = 0;
        while(index <= (haystack.length() - needle.length())) {
            for(int i = 0; i < needle.length(); i++) {
                if(needle.charAt(i) == haystack.charAt(index + i)) {
                    corrects++;
                } else {
                    corrects = 0;
                    break;
                }
            }
            if(corrects == needle.length()) {
                return index;
            }
            index++;
        }
        return -1;
    }

    //0ms 100%
    public static int SolutionStartsWith(String haystack, String needle) {
        for(int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.startsWith(needle, i)) {
                return i;
            }
        }
        return -1;
    }

}
