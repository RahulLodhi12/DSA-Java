package Recursion.Subsequences_Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum_1 {
    public static void combinationSum(int[] arr, List<Integer> temp, int idx, int n, int k, int sum, List<List<Integer>> ans){
        //base case
        if(idx==n){
            if(sum==k){
                ans.add(new ArrayList<>(temp));
                return;
            }
            else{
                return;
            }
        }

        //take
        if(sum+arr[idx]<=k){
            temp.add(arr[idx]); //push
            combinationSum(arr,temp,idx,n,k,sum+arr[idx],ans);
            temp.remove(temp.size()-1); //pop
        }

        //skip
        combinationSum(arr,temp,idx+1,n,k,sum,ans);

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        combinationSum(arr,temp,0,n,k,0,ans);

        for(List<Integer> lst: ans){
            for(Integer i: lst){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
