/*  
(Maximum SubArray : " https://leetcode.com/problems/maximum-subarray/description/ " )
Question : Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

*/

import java.util.*;

public class Problem7 {
    public static int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp += nums[i];
            result = Math.max(result, temp);
            if (temp < 0) {
                temp = 0;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum SubArray Sum: " + maxSubArray(nums));
    }
}

