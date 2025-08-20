package org.example;
import java.util.HashMap;
import java.util.Map;

/*  -------------------------------------------------------------------------------------------------------------------------
    Problem Description:
    Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    You may assume that each input would have exactly one solution, and you may not use the same element twice.
    You can return the answer in any order.
    -------------------------------------------------------------------------------------------------------------------------
    Runtime: 2ms 98.92%
 */

public class TwoSum {

    public int[] Solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

}
