/*
Question : ( Count the triplets  " https://www.geeksforgeeks.org/problems/count-the-triplets4615/1 " )

Given an array Arr consisting of N distinct integers. 
The task is to count all the triplets such that sum of two 
elements equals the third element.

Example :

Input: 
N = 4 
arr[] = {1, 5, 3, 2}
Output: 2 
Explanation: There are 2 triplets:
 1 + 2 = 3 and 3 +2 = 5

*/

import java.util.*;

public class Problem4 {

    public static int countTriplets(int[] arr, int n) {
        int count = 0;

        // Loop to count for triplets
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] == arr[k]) {
                        count++;
                    } else if (arr[i] + arr[k] == arr[j]) {
                        count++;
                    } else if (arr[j] + arr[k] == arr[i]) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int n = 4;
        int[] arr = { 1, 5, 3, 2 };
        System.out.println(countTriplets(arr, n));
    }

}