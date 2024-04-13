/*
Question : (Max Sum SubArray of size K " https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1 " )

NOTE : A SubArray is a contiguous part of any given array.

Example :

Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.
 
*/


import java.util.*;

public class Problem1 {
    static long maximumSumSubArray(int K, ArrayList<Integer> Arr,int N){
        long result = Integer.MIN_VALUE;
        long windowSum=0;
        int left =0;
        for(int right=0;right<Arr.size();right++){
            windowSum += Arr.get(right);
            if(right-left+1==K){
                result = Math.max(result,windowSum);
                windowSum -=Arr.get(left);
                left++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 4;
        int K = 2;
        ArrayList<Integer> Arr = new ArrayList<>(Arrays.asList(100, 200, 300, 400));
        System.out.println(maximumSumSubArray(K, Arr, N));
    }
}

