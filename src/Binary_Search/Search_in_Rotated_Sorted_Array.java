package Binary_Search;

import java.util.Scanner;

public class Search_in_Rotated_Sorted_Array {
    public static int searchInRotatedSorted(int[] nums, int x){
        int n=nums.length;
        int s=0,e=n-1;

        while (s<=e){
            int m = s + (e-s)/2;

            //check if x at 'm', must be 1st statement
            if(nums[m]==x){
                return m;
            }

            if(nums[s]<=nums[m]){ //left is sorted
                if(x>=nums[s] && x<=nums[m]){ //x present b/w 's' and 'm'
                    e=m-1;
                }
                else{
                    s=m+1;
                }
            }
            else{ //right is sorted
                if(x>=nums[m] && x<=nums[e]){ //x present b/w 's' and 'm'
                    s=m+1;
                }
                else{
                    e=m-1;
                }
            }
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        /*
        Example 1:
        Input Format: arr = [4,5,6,7,0,1,2,3], x = 0
        Result: 4
        Explanation: Here, the target is 0. We can see that 0 is present in the given rotated sorted array,
        nums. Thus, we get output as 4, which is the index at which 0 is present in the array.

        Example 2:
        Input Format: arr = [4,5,6,7,0,1,2], x = 3
        Result: -1
        Explanation: Here, the target is 3. Since 3 is not present in the given rotated sorted array.
        Thus, we get the output as -1.
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

        System.out.println("Output: " + searchInRotatedSorted(nums,x));

    }
}
