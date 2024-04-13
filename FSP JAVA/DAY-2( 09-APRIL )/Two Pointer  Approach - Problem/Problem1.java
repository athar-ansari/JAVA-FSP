/*
Question : ( Reverse String " https://leetcode.com/problems/reverse-string/description/ " ) 
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

Example 1:

Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

*/


import java.util.*;

public class Problem1 {

        public static void reverseArray(char[] s) {
            int left = 0;
            int right = s.length - 1;
            while (left < right) {
                char temp = s[left];
                s[left] = s[right];
                s[right] = temp;
                left++;
                right--;
            }
        }
    
        public static void main(String[] args) {
            char[] s = {'h', 'e', 'l', 'l', 'o'};
            reverseArray(s);
            System.out.println(Arrays.toString(s)); // Output: [o, l, l, e, h]
        }
}
    
