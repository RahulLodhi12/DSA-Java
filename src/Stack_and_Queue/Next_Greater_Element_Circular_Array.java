package Stack_and_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Next_Greater_Element_Circular_Array {
    public static int[] nextGreaterElement(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%n]){
                st.pop();
            }
            if(st.isEmpty()){
                ans[i%n]=-1;
            }
            else{
                ans[i%n]=st.peek();
            }
            st.push(nums[i%n]);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            int e = sc.nextInt();
            nums[i] = e;
        }

        System.out.println("Arrays: ");

        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] ans = nextGreaterElement(nums);

        System.out.println("Output: ");
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }

}
