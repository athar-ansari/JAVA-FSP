/*
Question : ( Container With Most Water " https://leetcode.com/problems/container-with-most-water/description/ " ) 

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Example 1:

<img src="https://github.com/athar-ansari/JAVA-FSP/assets/118714083/e735a8e1-fd14-4d96-ba1d-b703821b2e97" width="75%">


Input: height = [1,8,6,2,5,4,8,3,7]  <br>
Output: 49

Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

Example 2:

Input: height = [1,1]    <br>
Output: 1

### NOTE :-  IF YOU WANT TO RUN THIS CODE, THEN RENAME THE FILE " Problem4-java.md " TO " Problem4.java " .

*/

//comment-out this⤵️

```
import java.util.*;

public class Problem4 { 
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1; 

        while(left < right){
            int h = Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea,h*(right - left));
            if (height[left] < height[right]){
                 left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(height);
        System.out.println("The maximum area is: " + result); 
    }
}

```
