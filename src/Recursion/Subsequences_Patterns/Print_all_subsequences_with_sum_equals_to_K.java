package Recursion.Subsequences_Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_all_subsequences_with_sum_equals_to_K {
    public static void subSeq_sum_K(int[] arr, List<Integer> curr, int idx, int n, int k, int sum, List<List<Integer>> ans){
        //base case
        if(idx==n){
            if(sum==k){
                ans.add(new ArrayList<>(curr));
                return;
            }
            else{
                return;
            }
        }

        //take
        curr.add(arr[idx]);
        sum+=arr[idx];
        subSeq_sum_K(arr,curr,idx+1,n,k,sum,ans);

        //skip
        curr.remove(curr.size()-1);
        sum-=arr[idx];
        subSeq_sum_K(arr,curr,idx+1,n,k,sum,ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        List<Integer> curr = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        subSeq_sum_K(arr,curr,0,n,k,0,ans);

        for(List<Integer> lst: ans){
            for(Integer i: lst){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
