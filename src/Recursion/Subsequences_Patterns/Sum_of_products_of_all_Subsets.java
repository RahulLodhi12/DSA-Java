package Recursion.Subsequences_Patterns;

import java.util.Scanner;

public class Sum_of_products_of_all_Subsets {
    public static int sumOfProductsAllSubsets(int[] arr, int idx, int n, int prod){
        //base case
        if(idx==n){
            return prod; //single product of a single subset
        }

        //take
        int take = sumOfProductsAllSubsets(arr,idx+1,n,prod*arr[idx]);

        //skip
        int skip = sumOfProductsAllSubsets(arr,idx+1,n,prod);

        return take + skip; //sum of products of all subsets
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sumOfProductsAllSubsets(arr,0,n,1)-1);
    }
}
