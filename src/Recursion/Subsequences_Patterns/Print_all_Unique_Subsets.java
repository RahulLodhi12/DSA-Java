package Recursion.Subsequences_Patterns;

import java.util.*;

public class Print_all_Unique_Subsets {
    public static void printAllUniqueSubsets_bruteForce(int[] arr, int idx, int n, List<Integer> temp, Set<List<Integer>> ans){
        //base case
        if(idx==n){
            ans.add(new ArrayList<>(temp));
            return;
        }

        //take
        temp.add(arr[idx]);
        printAllUniqueSubsets_bruteForce(arr,idx+1,n,temp,ans);

        //skip
        temp.remove(temp.size()-1);
        printAllUniqueSubsets_bruteForce(arr,idx+1,n,temp,ans);
    }

    public static void printAllUniqueSubsets_optimal(int[] arr, int i, int n, List<Integer> temp, List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));

        //base case
        if(i==n) return;

        for(int k=i;k<n;k++){
            if(k>i && arr[k]==arr[k-1]) continue;

            temp.add(arr[k]);
            printAllUniqueSubsets_optimal(arr,k+1,n,temp,ans);
            temp.remove(temp.size()-1); //backtrack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

//        List<Integer> temp = new ArrayList<>();
//        Set<List<Integer>> ans = new HashSet<>();
//
//        printAllUniqueSubsets_bruteForce(arr,0,n,temp,ans);
//
//        for(List<Integer> lst: ans){
//            for(int i: lst){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        printAllUniqueSubsets_optimal(arr,0,n,temp,ans);

        for(List<Integer> lst: ans){
            for(int i: lst){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
