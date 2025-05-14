package Recursion.Subsequences_Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Count_Subsequences_or_Subsets_with_Sum_K {
    public static int subSeq_sum_K(int[] arr, int idx, int n, int k, int sum){
        //base case
        if(idx==n){
            if(sum==k) return 1;
            else return 0;
        }

        //take
        int take=0;
        sum+=arr[idx];
        take = subSeq_sum_K(arr,idx+1,n,k,sum);

        //skip
        int skip=0;
        sum-=arr[idx];
        skip = subSeq_sum_K(arr,idx+1,n,k,sum);

        return take+skip;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        System.out.println(subSeq_sum_K(arr, 0, n, k, 0));
    }
}
