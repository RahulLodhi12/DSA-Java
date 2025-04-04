package Binary_Search;

import java.util.Scanner;

public class Search_Element_in_Rotated_Sorted_Array_II_duplicate_elements {
    //Note: Reason, why can't use same code of Part I, because of below example:
    //nums[] = [1,0,1,1,1]
    //In above array, 's', 'm', and 'e' pointers points to same element, here '1'.
    public static boolean searchInRotatedSorted_duplicates(int[] nums, int x){
        int n=nums.length;
        int s=0,e=n-1;

        while (s<=e){
            int m = s + (e-s)/2;

            //check if x at 'm', must be 1st statement
            if(nums[m]==x){
                return true;
            }

            //check if 's','m','e' points to same elements
            if(nums[s]==nums[m] && nums[m]==nums[e]){
                s++;
                e--;
                continue; //continue because after s++ and e--, we will get new 'mid' pointer,
                // so we can't proceed with later code.
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

        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];
        /*
        Example 1:
        Input Format:
        arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 3
        Result: True
        Explanation:
        The element 3 is present in the array. So, the answer is True.

        Example 2:
        Input Format:
        arr = [7, 8, 1, 2, 3, 3, 3, 4, 5, 6], k = 10
        Result: False
        Explanation:
        The element 10 is not present in the array. So, the answer is False.
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

        System.out.println("Output: " + searchInRotatedSorted_duplicates(nums,x));

    }
}
