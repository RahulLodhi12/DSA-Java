package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class Count_Subarrays_with_given_XOR {
    public static int count_Subarray_with_Given_XOR_optimal(int[] nums, int k){
        int prefixXor=0;

        HashMap<Integer,Integer> mpp = new HashMap<>(); //map<prefixXor,cnt>
        int cnt=0;

        mpp.put(0,1);

        for(int i: nums){
            prefixXor^=i;

            if(mpp.containsKey(prefixXor^k)){ //opposite of XOR is 'XOR' in programming.
                cnt+=mpp.get(prefixXor^k);
            }

            if(mpp.containsKey(prefixXor)){
                mpp.put(prefixXor,mpp.getOrDefault(prefixXor,0)+1);
            }
            else{
                mpp.put(prefixXor,1);
            }
        }

        return cnt;
    }
    public static void main(String[] args){
/*
Example 1:
Input Format: A = [4, 2, 2, 6, 4] , k = 6
Result: 4
Explanation: The subarrays having XOR of their elements as 6 are  [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]

Example 2:
Input Format: A = [5, 6, 7, 8, 9], k = 5
Result: 2
Explanation: The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]

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

        System.out.println("Enter XOR(k): ");
        int k = sc.nextInt();

        System.out.println("Output: " + count_Subarray_with_Given_XOR_optimal(nums,k));
    }
}
