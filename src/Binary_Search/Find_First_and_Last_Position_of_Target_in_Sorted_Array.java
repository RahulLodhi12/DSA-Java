package Binary_Search;

import java.util.Scanner;

public class Find_First_and_Last_Position_of_Target_in_Sorted_Array {
    public static int findFirst(int[] nums, int x){
        int n=nums.length;

        int s=0,e=n-1;
        int idx=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]>x){
                e=m-1;
            }
            else if(nums[m]<x){
                s=m+1;
            }
            else{
                idx=m;
                e=m-1;
            }
        }
        return idx;
    }
    public static int findLast(int[] nums, int x){
        int n=nums.length;

        int s=0,e=n-1;
        int idx=-1;
        while(s<=e){
            int m=s+(e-s)/2;
            if(nums[m]>x){
                e=m-1;
            }
            else if(nums[m]<x){
                s=m+1;
            }
            else{
                idx=m;
                s=m+1;
            }
        }
        return idx;
    }
    public static int[] findFirstLast(int[] nums, int x) {
        int first = findFirst(nums,x);
        int last = findLast(nums,x);

        return new int[]{first,last};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        /*
        Example 1:
        Input Format: n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 8
        Result: 3 5
        Explanation: The first occurrence of 8 is at index 3 and the last occurrence is at index 5.

        Example 2:
        Input Format: n = 8, arr[] = {2, 4, 6, 8, 8, 8, 11, 13}, k = 10
        Result: -1 -1
        Explanation: The target value is not present in the array. So, we have returned -1 as
        the indices of the first and the last occurrence.
        */
        for (int i = 0; i < n; i++) {
            int e = sc.nextInt();
            nums[i] = e;
        }

        System.out.println("Arrays: ");

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Enter x value: ");
        int x = sc.nextInt();

        System.out.println("Output: ");
        int[] ans = findFirstLast(nums,x);

        for(int i: ans){
            System.out.print(i+" ");
        }

    }
}
