package Binary_Search;

import java.util.Scanner;

public class Floor_and_Ceil_in_Sorted_Array {
    public static int findCeil(int[] nums, int x){
        int n=nums.length;
        int s=0,e=n-1;
        int ans=Integer.MAX_VALUE; //floor value means smallest value>=x
        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m]<x){
                s=m+1;
            }
            else{ //ans will be here
                ans=Math.min(ans,nums[m]);
                e=m-1;
            }
        }

        return ans;
    }
    public static int findFloor(int[] nums, int x){
        int n=nums.length;
        int s=0,e=n-1;
        int ans=Integer.MIN_VALUE; //floor value means largest value<=x
        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m]>x){
                e=m-1;
            }
            else{ //ans will be here
                ans=Math.max(ans,nums[m]);
                s=m+1;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        /*
        Example 1:
        Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 5
        Result: 4 7
        Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7.

        Example 2:
        Input Format: n = 6, arr[] ={3, 4, 4, 7, 8, 10}, x= 8
        Result: 8 8
        Explanation: The floor of 8 in the array is 8, and the ceiling of 8 in the array is also 8.
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

        System.out.println("Floor: " + findFloor(nums,x) + " Ceil: " + findCeil(nums,x));

        /*
        What is the floor of x?
        The floor of x is the largest element in the array which is smaller than or equal to x
        ( i.e. largest element in the array <= x).

        What is the ceiling of x?
        The ceiling of x is the smallest element in the array greater than or equal to x
        ( i.e. smallest element in the array >= x).
        */
    }
}
