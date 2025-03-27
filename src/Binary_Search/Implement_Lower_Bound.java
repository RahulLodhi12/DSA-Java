package Binary_Search;

import java.util.Scanner;

public class Implement_Lower_Bound {
    public static int lowerBound(int[] nums, int x){
        int n=nums.length;
        int s=0,e=n-1;

        int idx=n; //ans;

        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m]<x){
                s=m+1;
            }
            else if(nums[m]>=x){ //ans will be here
                idx = Math.min(idx,m);
                e=m-1;
            }
        }

        return idx;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        //arr[] = {3,5,8,15,19}, x = 9
        //O/P: 3, Index 3 is the smallest index such that arr[3] >= x.
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

        System.out.println("Output: " + lowerBound(nums,x)); //return idx.
        /*
        What is Lower Bound?
        The lower bound algorithm finds the first or the smallest index in a sorted array
        where the value at that index is greater than or equal to a given key i.e. x.

        The lower bound is the smallest index, ind, where arr[ind] >= x.
        But if any such index is not found, the lower bound algorithm returns n i.e. size of the given array.
        */
    }
}
