package Recursion.Strong_Hold;

public class Reverse_Array {
    public static void reverse_iterative(int[] arr, int n){
        int s=0,e=n-1;

        while(s<e){
            //swap
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }

    public static void reverse_recursive(int[] arr, int s, int e){
        //base case
        if(s>=e) return;

        //swapping
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;

        reverse_recursive(arr,s+1,e-1);
    }

    public static void main(String[] args){
        int[] arr = {11,22,33,44,55};

        int n = arr.length;

        System.out.println("Before: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();

//        reverse_iterative(arr,n);

        reverse_recursive(arr,0,n-1);

        System.out.println("After: ");
        for(int i: arr){
            System.out.print(i+" ");
        }
    }
}
