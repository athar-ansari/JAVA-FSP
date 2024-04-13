/*
Question : ( Maximum Sum of Distinct Subarrays With Length K " https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/description/ ")

You are given an integer array nums and an integer k. Find the maximum subarray sum of all the subarrays of nums that meet the following conditions:

> The length of the subarray is k, and
> All the elements of the subarray are distinct.

Return the maximum subarray sum of all the subarrays that meet the conditions. 
If no subarray meets the conditions, return 0.

A Subarray is a contiguous non-empty sequence of elements within an array.

 

Example :

Input: nums = [1,5,4,2,9,9,9], k = 3
Output: 15

Explanation: The subarrays of nums with length 3 are:
- [1,5,4] which meets the requirements and has a sum of 10.
- [5,4,2] which meets the requirements and has a sum of 11.
- [4,2,9] which meets the requirements and has a sum of 15.
- [2,9,9] which does not meet the requirements because the element 9 is repeated.
- [9,9,9] which does not meet the requirements because the element 9 is repeated.

We return 15 because it is the maximum subarray sum of all the subarrays that meet the conditions

 */



import java.util.*;

public class Problem2 {
    public static long maximumSubArraySum(int[] nums, int k) {
        long result = 0;
        HashSet<Integer> set = new HashSet<Integer>();
        long sum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            while (set.contains(nums[right])) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(nums[right]);
            sum += nums[right];
            if (right - left + 1 == k) {
                result = Math.max(result, sum);
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;
        System.out.println(maximumSubArraySum(nums, k));
    }
}