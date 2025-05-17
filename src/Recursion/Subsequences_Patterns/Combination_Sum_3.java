package Recursion.Subsequences_Patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combination_Sum_3 {
    //T.C: O(2^9 * k) = O(512 * k)
    //S.C: O(k*x)
    public static void solve(int[] arr, int idx, int n, int len, int k, int sum, List<Integer> temp, List<List<Integer>> ans){
        //base case
        if(idx==n){
            if(temp.size()==len && k==sum){
                ans.add(new ArrayList<>(temp));
                return;
            }
            else{
                return;
            }
        }


        //take
        temp.add(arr[idx]);
        solve(arr,idx+1,n,len,k,sum+arr[idx],temp,ans);

        //skip
        temp.remove(temp.size()-1);
        solve(arr,idx+1,n,len,k,sum,temp,ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int len = sc.nextInt(); //size
        int k = sc.nextInt(); //sum

        int[] arr = {1,2,3,4,5,6,7,8,9};
        int n=arr.length;

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        solve(arr,0,n,len,k,0,temp,ans);

        for(List<Integer> lst: ans){
            for(Integer i: lst){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
