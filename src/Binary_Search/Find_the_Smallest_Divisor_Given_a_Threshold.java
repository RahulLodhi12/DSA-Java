package Binary_Search;

import java.util.Scanner;

public class Find_the_Smallest_Divisor_Given_a_Threshold {
    public static int findSmallestDivisor_bruteForce(int[] nums, int threshold){
        int d=1;

        while(d>0){
            int sum=0;
            for(int i: nums){
                sum+=Math.ceil((double)i/d);
            }
            if(sum<=threshold){
                return d;
            }
            d++;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        System.out.println("Arrays: ");

        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Enter Threshold: ");
        int threshold = sc.nextInt();

        System.out.println("Output: " + findSmallestDivisor_bruteForce(nums,threshold));
    }
}
