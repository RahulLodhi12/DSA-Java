package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Longest_Subarray_with_sum_K_Postives_and_Negatives {
    public static int longestSubArrayWithSumK_optimal(int[] nums, int k){
        int n=nums.length;
        int maxLen=0;

        HashMap<Integer,Integer> mpp = new HashMap<>(); //map<prefixSum,idx>

        int prefixSum=0;
        for(int i=0;i<n;i++){
            prefixSum+=nums[i];

            if(prefixSum==k){
                maxLen = Math.max(i+1,maxLen);
            }

            if(mpp.containsKey(prefixSum-k)){
                maxLen = Math.max(i-mpp.get(prefixSum-k),maxLen);
            }

            if(!mpp.containsKey(prefixSum)){
                mpp.put(prefixSum,i);
            }
        }

        return maxLen;


    }

    public static int longestSubArrayWithSumK_bruteForce(int[] nums, int k){
        int n=nums.length;
        int maxLen=0;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums[j];
                if(sum==k){
                    maxLen = Math.max(maxLen,j-i+1);
                }
            }
        }

        return maxLen;
    }

    public static void main(String[] args){
        /*
        Example 1:
        Input Format: N = 3, k = 5, array[] = {2,3,5}
        Result: 2
        Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

        Example 2:
        Input Format: N = 3, k = 1, array[] = {-1, 1, 1}
        Result: 3
        Explanation: The longest subarray with sum 1 is {-1, 1, 1}. And its length is 3.

        Example 3:
        Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
        Result: 3
        Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
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

        System.out.println("Enter k:");

        int k = sc.nextInt();

//        System.out.println("Output: "+longestSubArrayWithSumK_bruteForce(nums,k));

        System.out.println("Output: " + longestSubArrayWithSumK_optimal(nums,k));

    }
}
