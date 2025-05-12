package Recursion.Strong_Hold;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Print_any_Subsequence_whose_sum_is_K {
    public static boolean subSeq_sum_K(int[] arr, List<Integer> curr, int idx, int n, int k, int sum){
        //base case
        if(idx==n){
            if(sum==k){
                System.out.println(curr);
                return true;
            }
            else{
                return false;
            }
        }

        //take
        curr.add(arr[idx]);
        sum+=arr[idx];
        if(subSeq_sum_K(arr,curr,idx+1,n,k,sum)==true) return true;

        //skip
        curr.remove(curr.size()-1);
        sum-=arr[idx];
        if(subSeq_sum_K(arr,curr,idx+1,n,k,sum)==true) return true;

        return false;
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

        System.out.println(subSeq_sum_K(arr,curr,0,n,k,0));
    }
}
