package Recursion.Strong_Hold;

public class Maximum_element_in_array {
    public static int findMax(int[] arr, int n){
        //base case
        if(n==1) return arr[0];

        return Math.max(arr[n-1],findMax(arr,n-1));
    }
    public static void main(String[] args){
        int[] arr = {11,77,88,33,44,22};
        int n=arr.length;

        System.out.println(findMax(arr,n));
    }
}
