/*
Question : ( Equilibrium Point " https://www.geeksforgeeks.org/problems/equilibrium-point-1587115620/1 " ) 

Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array. 
Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

Example :

Input: 
n = 5 
A[] = {1,3,5,2,2} 

Output: 
3 

Explanation:  
equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). 

*/

import java.util.*;

public class Problem3 { 
        public static int equilibriumPoint(long arr[], int n) {
           
            long totalSum = 0;
            for(int i = 0; i < n; i++){
                totalSum += arr[i];
            }
            long leftSum = 0;
            for(int i = 0; i < n; i++){
                totalSum -= arr[i];
    
                if (leftSum == totalSum)
                   return i + 1;
                leftSum += arr[i];
            }
            return -1;
        }
    
        public static void main(String[] args) {
            long[] numbers = {1, 3, 5, 2, 2};
            int n = 5;
            int result = equilibriumPoint(numbers, n);
            System.out.println("The equilibrium point is: " + result);
        }
}
    