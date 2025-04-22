package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Merge_Sort {
    public static void merge(int[] nums, int l, int m, int h){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=l;
        int j=m+1;

        while(i<=m && j<=h){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i++;
            }
            else{
                temp.add(nums[j]);
                j++;
            }
        }

        while(i<=m){
            temp.add(nums[i]);
            i++;
        }

        while(j<=h){
            temp.add(nums[j]);
            j++;
        }

        int p=0;
        for(int k=l;k<=h;k++){
            nums[k]=temp.get(p);
            p++;
        }
    }
    public static void mergeSort(int[] nums, int l, int h){
        if(l>=h) return; //base case

        int m = (l+h)/2;

        mergeSort(nums,l,m); //divide
        mergeSort(nums,m+1,h); //divide

        merge(nums,l,m,h); //merge
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Before Merge Sort: ");

        for(int i: nums){
            System.out.print(i+" ");
        }

        mergeSort(nums,0,n-1);

        System.out.println();

        System.out.println("After Merge Sort: ");

        for(int i: nums){
            System.out.print(i+" ");
        }
    }
}
