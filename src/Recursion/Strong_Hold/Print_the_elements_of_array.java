package Recursion.Strong_Hold;

import java.util.Scanner;

public class Print_the_elements_of_array {
    public static void printArray(int[] arr, int i, int n){
        //base case
        if(i==n) return;

        System.out.println(arr[i]);

        printArray(arr,i+1,n);
    }
    public static void main(String[] args){
        int[] arr = {11,22,33,44,55};
        int n = arr.length;

        printArray(arr,0,n);
    }
}
