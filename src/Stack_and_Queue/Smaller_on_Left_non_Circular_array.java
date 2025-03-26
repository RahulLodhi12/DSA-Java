package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Smaller_on_Left_non_Circular_array {
    public static int[] smallerOnLeft(int[] nums){
        int n=nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){
            while (!st.isEmpty() && st.peek()>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=st.peek();
            }
            st.push(nums[i]);
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            int e = sc.nextInt();
            nums[i]=e;
        }

        System.out.println("Arrays: ");

        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();

        int[] ans = smallerOnLeft(nums);

        System.out.println("Output: ");
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
