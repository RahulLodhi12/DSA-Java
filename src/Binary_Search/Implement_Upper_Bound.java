package Binary_Search;

import java.util.Scanner;

public class Implement_Upper_Bound {
    public static int upperBound(int[] nums, int x){
        int n=nums.length;
        int s=0,e=n-1;

        int idx=n; //ans;

        while(s<=e){
            int m = s + (e-s)/2;
            if(nums[m]<=x){
                s=m+1;
            }
            else if(nums[m]>x){ //ans will be here
                idx = Math.min(idx,m);
                e=m-1;
            }
        }

        return idx;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        //arr[] = {3,5,8,9,15,19}, x = 9
        //O/P: 4, Index 4 is the smallest index such that arr[4] > x.
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

        System.out.println("Output: " + upperBound(nums, x)); //return idx.

        /*
        What is Upper Bound?
        The upper bound algorithm finds the first or the smallest index in a sorted array
        where the value at that index is greater than the given key i.e. x.

        The upper bound is the smallest index, ind, where arr[ind] > x.

        But if any such index is not found, the upper bound algorithm returns n i.e. size of the given array.
        The main difference between the lower and upper bound is in the condition.
        For the lower bound the condition was arr[ind] >= x and here,
        in the case of the upper bound, it is arr[ind] > x.
         */

    }
}
