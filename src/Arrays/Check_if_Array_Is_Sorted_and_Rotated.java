package Arrays;

import java.util.Scanner;

public class Check_if_Array_Is_Sorted_and_Rotated {

    public static boolean isSorted(int[] nums){
        int n=nums.length;

        int bp=0; //breaking-point
        for(int i=1;i<=n;i++){
            if(nums[(i-1)%n]>nums[i%n]){
                bp++;
            }
            if(bp>1) return false;
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[] nums = new int[n]; //[3,4,5,1,2] o/p: true

        for(int i=0;i<n;i++){
            int e = sc.nextInt();
            nums[i]=e;
        }

        System.out.println("Arrays:");
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();


        System.out.println(isSorted(nums));
    }
}
