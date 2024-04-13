/*
Question : ( Longest Substring Without Repeating Characters " https://leetcode.com/problems/longest-substring-without-repeating-characters/description/ " )

Given a string s, find the length of the longest substring without repeating characters.

 
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.


Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

*/


import java.util.*;

public class Problem3 { 
   
    public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        Map<Character, Integer> charIndex = new HashMap<>();
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char currentChar = s.charAt(right);
            if(charIndex.containsKey(currentChar)){
                left = Math.max(left, charIndex.get(currentChar) + 1);
            }
            charIndex.put(currentChar, right);
            result = Math.max(result, right - left + 1);
        } 
        return result;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println("The length of the longest substring without repeating characters is: " + Problem3.lengthOfLongestSubstring(s));
    }
    
}



