/*
Question : ( Maximum Sum Circular SubArray " https://leetcode.com/problems/maximum-sum-circular-subarray/description/ " ) 

Given a circular integer array nums of length n, return the maximum possible sum of a non-empty subarray of nums.

A circular array means the end of the array connects to the beginning of the array. Formally, 
the next element of nums[i] is nums[(i + 1) % n] and the previous element of nums[i] is nums[(i - 1 + n) % n].


A subarray may only include each element of the fixed buffer nums at most once. 
Formally, for a subarray nums[i], nums[i + 1], ..., nums[j], there does not exist i <= k1, k2 <= j with k1 % n == k2 % n.

 

Example 1:

Input: nums = [1,-2,3,-2]
Output: 3
Explanation: Subarray [3] has maximum sum 3.

Example 2:

Input: nums = [5,-3,5]
Output: 10
Explanation: Subarray [5,5] has maximum sum 5 + 5 = 10.

Example 3:

Input: nums = [-3,-2,-3]
Output: -2
Explanation: Subarray [-2] has maximum sum -2.
 

*/


import java.util.*;

public class Problem3 {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = kadane(nums);

        if (maxSum < 0) return maxSum;

        int totalSum = 0;

        for (int num : nums) {
            totalSum += num;
        }

        int[] negatedNums = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            negatedNums[i] = -nums[i];
        }

        int minSum = kadane(negatedNums);

        int maxCircularSum = totalSum + minSum;

        return Math.max(maxSum, maxCircularSum);
    }

    private int kadane(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; 
    }

    public static void main(String[] args) {
        Problem3 problem = new Problem3();
        int[] nums = {1, -2, 3, -2}; // Example input
        int result = problem.maxSubarraySumCircular(nums);
        System.out.println("The maximum subarray sum in the circular array is: " + result);
    }
}
