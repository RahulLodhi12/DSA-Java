package Binary_Search;

import java.util.Scanner;

public class Minimum_in_Rotated_Sorted_Array {
    public static int findMinimum(int[] nums){
        int n = nums.length;
        int s=0,e=n-1;
        int ans = Integer.MAX_VALUE;
        while(s<=e){
            int m = s+(e-s)/2;

            //if we get sub-array or array already sorted.
            if(nums[s]<=nums[e]){
                ans = Math.min(ans,nums[s]);
                return ans;
            }

            if(nums[s]<=nums[m]){ //left is sorted
                ans=Math.min(ans,nums[s]);
                s=m+1;
            }
            else{ //right is sorted
                ans=Math.min(ans,nums[m]);
                e=m-1;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            int e = sc.nextInt();
            arr[i]=e;
        }

        System.out.println(findMinimum(arr));
    }
}
