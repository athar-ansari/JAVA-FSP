/*
Question : ( Trapping Rain Water " https://leetcode.com/problems/trapping-rain-water/description/ " ) 
<br>

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

<br>

Example 1:

<img src="https://github.com/athar-ansari/JAVA-FSP/assets/118714083/db762b8f-b1a5-413e-963d-8cf61c1fb778" width="75%">


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]   <br>
Output: 6

Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
<br>

Example 2:

Input: height = [4,2,0,3,2,5]    <br>
Output: 9
 
 
### NOTE :-  IF YOU WANT TO RUN THIS CODE, THEN RENAME THE FILE " Problem2-java.md " TO " Problem2.java " .

*/

//comment-out this⤵️

```

import java.util.*;

public class Problem2 {
    public int trap(int[] height) {
        int n = height.length;
        int water = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty())
                    break;
                int distance = i - stack.peek() - 1;
                int boundedHeight = Math.min(height[i], height[stack.peek()]) - height[top];
                water += distance * boundedHeight;
            }
            stack.push(i);
        }
        return water;
    }

    public static void main(String[] args) {
        Problem2 problem = new Problem2();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1}; // Example input
        int result = problem.trap(height);
        System.out.println("The trapped water is: " + result);
    }
}

```
