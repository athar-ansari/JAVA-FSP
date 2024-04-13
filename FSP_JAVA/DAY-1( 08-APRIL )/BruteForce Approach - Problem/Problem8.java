/*  
(Maximum Product SubArray : " https://leetcode.com/problems/maximum-subarray/description/ " )
Question : Given an integer array nums, find a SubArray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

 
Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.


Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a SubArray.

*/

import java.util.*;

public class Problem8 {
    public static int maxProduct(int[] nums) {
        int mxProduct = nums[0], mnProduct = nums[0], result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = mxProduct;
                mxProduct = mnProduct;
                mnProduct = temp;
            }
            mxProduct = Math.max(nums[i], nums[i] * mxProduct);
            mnProduct = Math.min(nums[i], nums[i] * mnProduct);
            result = Math.max(result, mxProduct);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, -2, 4 };
        System.out.println("Maximum Product SubArray: " + maxProduct(nums));
    }
}
