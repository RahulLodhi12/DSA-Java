package Recursion.Strong_Hold;

import java.util.ArrayList;
import java.util.List;

public class Print_all_subsets_of_array {
    public static void printSubSets(int[] arr, List<Integer> temp, int idx, int n){
        //base case
        if(idx==n){
            System.out.println(temp);
            return;
        }

        //take
        temp.add(arr[idx]);
        printSubSets(arr,temp,idx+1,n);

        //skip
        temp.remove(temp.size()-1);
        printSubSets(arr,temp,idx+1,n);
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        int n=arr.length;

        List<Integer> temp = new ArrayList<>();

        System.out.println("All Subsets:");

        printSubSets(arr,temp,0,n);
    }
}
