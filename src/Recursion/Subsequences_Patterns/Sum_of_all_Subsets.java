package Recursion.Subsequences_Patterns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sum_of_all_Subsets {
    public static void sumAllSubsets(int[] arr, int idx, int n, int sum, List<Integer> ans){
        //base case
        if(idx==n){
            ans.add(sum);
            return;
        }

        //take
        sumAllSubsets(arr,idx+1,n,sum+arr[idx],ans);

        //skip
        sumAllSubsets(arr,idx+1,n,sum,ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> ans = new ArrayList<>();

        sumAllSubsets(arr,0,n,0,ans);

        Collections.sort(ans);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
