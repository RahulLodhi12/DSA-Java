package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Two_Sum_Check_if_a_pair_with_given_sum_exists_in_Array {
    public static int[] twoSum_optimal(int[] nums, int target){ //sorting
        int[] ans = new int[2];
        int n = nums.length;

        int[] sortArr = Arrays.copyOf(nums,n);

        Arrays.sort(sortArr);
        int i=0,j=n-1;

        while(i<j){
            int val = sortArr[i]+sortArr[j];
            if(val > target){
                j--;
            }
            else if(val < target){
                i++;
            }
            else{
                break;
            }
        }

        int f=-1,s=-1;
        for(int k=0;k<n;k++){
            if(nums[k]==sortArr[i] && f==-1){
                f=k;
            }
            else if(nums[k]==sortArr[j] && s==-1){
                s=k;
            }
        }
        ans[0]=f;
        ans[1]=s;
        return ans;
    }
    public static int[] twoSum_hashing(int[] nums, int target){ //map
        int[] ans = new int[2];
        int n=nums.length;

        HashMap<Integer,Integer> mpp = new HashMap<>(); //mpp<ele,idx>

        for(int i=0;i<n;i++){
            int rem = target-nums[i];
            if(mpp.containsKey(rem)){
                ans[0] = i;
                ans[1] = mpp.get(rem);
                return ans;
            }
            mpp.put(nums[i],i);
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
    public static int[] twoSum_bruteForce(int[] nums, int target){
        int[] ans = new int[2];
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        ans[0]=-1;
        ans[1]=-1;
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Array:");

        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();

        int target = sc.nextInt();


//        int[] ans = twoSum_bruteForce(nums,target);

//        int[] ans = twoSum_hashing(nums,target);

        int[] ans = twoSum_optimal(nums,target);

        System.out.println("Output:");
        for(int i: ans){
            System.out.print(i+" ");
        }

    }
}
