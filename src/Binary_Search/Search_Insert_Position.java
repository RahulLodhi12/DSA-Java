package Binary_Search;

import java.util.Scanner;

public class Search_Insert_Position {
    public static int searchInsertPosition(int[] nums, int x){ //return idx.
        int n=nums.length;
        int s=0,e=n-1;

        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m]>x){
                e=m-1;
            }
            else if(nums[m]<x){
                s=m+1;
            }
            else{
                return m;
            }
        }

        return s;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        /*
        Example 1:
        Input Format: arr[] = {1,2,4,7}, x = 6
        Result: 3
        Explanation: 6 is not present in the array. So, if we will insert 6 in the
        3rd index(0-based indexing), the array will still be sorted. {1,2,4,6,7}.

        Example 2:
        Input Format: arr[] = {1,2,4,7}, x = 2
        Result: 1
        Explanation: 2 is present in the array and so we will return its index i.e. 1.
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

        System.out.println("Output: " + searchInsertPosition(nums,x));

    }
}
