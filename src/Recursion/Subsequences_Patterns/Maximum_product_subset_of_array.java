package Recursion.Subsequences_Patterns;

import java.util.Scanner;

public class Maximum_product_subset_of_array {
    public static int maxProduct(int[] arr, int idx, int n, int prod, boolean isTaken){
        //base case
        if(idx==n){
            if(isTaken) return prod;
            return Integer.MIN_VALUE; //when we skip all idx.
        }

        //take
        int take= maxProduct(arr,idx+1,n,prod*arr[idx],true);

        //skip
        int skip = maxProduct(arr,idx+1,n,prod,isTaken);

        return Math.max(take,skip);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maxProduct(arr,0,n,1,false));
    }
}
