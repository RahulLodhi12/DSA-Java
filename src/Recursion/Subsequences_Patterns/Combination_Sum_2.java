package Recursion.Subsequences_Patterns;

import java.util.*;

public class Combination_Sum_2 {
    //T.C: O((2^n)*k*log(k))
    public static void combinationSum2_bruteForce(int[] arr, List<Integer> temp, int idx, int n, int k, int sum, Set<List<Integer>> ans){
        //base case
        if(idx==n){
            if(sum==k){
                ans.add(new ArrayList<>(temp)); //O(k), because we are putting a ds into another ds and O(log(k)), because of add method of set ds .
                return;
            }
            else{
                return;
            }
        }

        //take
        if(sum+arr[idx]<=k){
            temp.add(arr[idx]);
            combinationSum2_bruteForce(arr,temp,idx+1,n,k,sum+arr[idx],ans);
            temp.remove(temp.size()-1);
        }

        //skip
        combinationSum2_bruteForce(arr,temp,idx+1,n,k,sum,ans);
    }

    //T.C: O((2^n)*k)
    public static void combinationSum2_optimal(int[] arr, List<Integer> temp, int i, int n, int target, int sum, List<List<Integer>> ans){
        //base case
        if(sum==target){
            ans.add(new ArrayList<>(temp)); //O(k), because we are putting a ds into another ds
            return;
        }

        for(int k=i;k<n;k++){
            if(k>i && arr[k]==arr[k-1]) continue;
            if(sum+arr[k]>target) break;

            temp.add(arr[k]);
            combinationSum2_optimal(arr,temp,k+1,n,target,sum+arr[k],ans);
            temp.remove(temp.size()-1);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        Arrays.sort(arr); //need for both bruteForce as well as for Optimal

        List<Integer> temp = new ArrayList<>();

//        Set<List<Integer>> ans1 = new HashSet<>();
//
//        combinationSum2_bruteForce(arr,temp,0,n,target,0,ans1);
//        for(List<Integer> lst: ans1){
//            for(Integer i: lst){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }


        List<List<Integer>> ans2 = new ArrayList<>();

        combinationSum2_optimal(arr,temp,0,n,target,0,ans2);


        for(List<Integer> lst: ans2){
            for(Integer i: lst){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
