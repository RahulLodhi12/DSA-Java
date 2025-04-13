package Arrays;

import java.util.Scanner;

public class Stock_Buy_And_Sell {
    public static int stockBuyAndSell_optimal(int[] nums){ //keeping minimum on left side of array.
        int maxi=0;
        int mini = Integer.MAX_VALUE;

        for(int i: nums){
            mini = Math.min(mini,i);
            int pro = i-mini;
            maxi = Math.max(maxi,pro);
        }
        return maxi;
    }
    public static int stockBuyAndSell_bruteForce(int[] nums){
        int n=nums.length;
        int maxi=0;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[j]>nums[i]){
                    maxi=Math.max(maxi,nums[j]-nums[i]);
                }
            }
        }

        return maxi;
    }
    public static void main(String[] args){
        /*
        Example 1:
        Input: prices = [7,1,5,3,6,4]
        Output: 5
        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

        Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

        Example 2:
        Input: prices = [7,6,4,3,1]
        Output: 0
        Explanation: In this case, no transactions are done and the max profit = 0.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Array:");

        for(int i: nums){
            System.out.print(i+" ");
        }

        System.out.println();

//        System.out.println("Output: "+stockBuyAndSell_bruteForce(nums));

        System.out.println("Output: "+stockBuyAndSell_optimal(nums));
    }

}
