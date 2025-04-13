package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Subarray_with_sum_Zero {
    public static int longestSubArray_with_Sum_Zero_optimal(int[] nums){
        int n=nums.length;
        int maxLen=0;

        HashMap<Integer,Integer> mpp = new HashMap<>(); //map<prefixSum,idx>
        int prefixSum=0;

        mpp.put(0,-1);

        for(int i=0;i<n;i++){
            prefixSum+=nums[i];

            if(mpp.containsKey(prefixSum-0)){
                maxLen = Math.max(maxLen,i-mpp.get(prefixSum-0));
                continue;
            }

            mpp.put(prefixSum,i);
        }

        return maxLen;
    }


    public static void main(String[] args){
        /*
Example 1:
Input Format: N = 6, array[] = {9, -3, 3, -1, 6, -5}
Result: 5
Explanation: The following subarrays sum to zero:
{-3, 3} , {-1, 6, -5}, {-3, 3, -1, 6, -5}
Since we require the length of the longest subarray, our answer is 5!

Example 2:
Input Format: N = 8, array[] = {6, -2, 2, -8, 1, 7, 4, -10}
Result: 8
Subarrays with sum 0 : {-2, 2}, {-8, 1, 7}, {-2, 2, -8, 1, 7}, {6, -2, 2, -8, 1, 7, 4, -10}
Length of longest subarray = 8

Example 3:
Input Format: N = 3, array[] = {1, 0, -5}
Result: 1
Subarray : {0}
Length of longest subarray = 1

Example 4:
Input Format: N = 5, array[] = {1, 3, -5, 6, -2}
Result: 0
Subarray: There is no subarray that sums to zero
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Array:");

        for(int i: nums){
            System.out.print(i+" ");
        }

        System.out.println();

        System.out.println("Output: " + longestSubArray_with_Sum_Zero_optimal(nums));
    }
}
