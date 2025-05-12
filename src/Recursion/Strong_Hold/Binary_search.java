package Recursion.Strong_Hold;

public class Binary_search {
    public static int binarySearch_iterative(int[] arr, int k, int n){
        int s=0,e=n-1;

        while(s<=e){
            int mid = s + (e-s)/2;

            if(arr[mid]<k){
                s=mid+1;
            }
            else if(arr[mid]==k){
                return mid;
            }
            else{
                e=mid-1;
            }
        }

        return -1;
    }

    public static int binarySearch_recursive(int[] arr, int k, int s, int e){
        //base case
        if(s>e) return -1;

        int mid = s + (e-s)/2;
        if(arr[mid]==k) return mid;

        if(arr[mid]<k) return binarySearch_recursive(arr,k,mid+1,e);
        return binarySearch_recursive(arr,k,s,mid-1);
    }

    public static void main(String[] args){
        int[] arr = {10,20,30,40,50,70}; //sorted array
        int n = arr.length;

        int k=40; //target

//        System.out.println(binarySearch_iterative(arr,k,n));

        System.out.println(binarySearch_recursive(arr,k,0,n-1));
    }
}
