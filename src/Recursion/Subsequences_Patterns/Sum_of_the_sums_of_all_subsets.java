package Recursion.Subsequences_Patterns;

import java.util.Scanner;

public class Sum_of_the_sums_of_all_subsets {
    public static int sumOfSumsAllSubsets(int[] arr, int idx, int n, int sum){
        //base case
        if(idx==n){
            return sum; //return sum of a single subset at a time
        }

        //take
        int take = sumOfSumsAllSubsets(arr,idx+1,n,sum+arr[idx]);

        //skip
        int skip = sumOfSumsAllSubsets(arr,idx+1,n,sum);

        return take+skip; //return sum of sums of all subsets
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(sumOfSumsAllSubsets(arr,0,n,0));
    }
}
