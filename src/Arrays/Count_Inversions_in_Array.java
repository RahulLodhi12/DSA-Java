package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Count_Inversions_in_Array {
    public static int merge(int[] nums, int l, int m, int h){
        ArrayList<Integer> temp = new ArrayList<>();
        int i=l;
        int j=m+1;
        int cnt=0;

        while(i<=m && j<=h){
            if(nums[i]<=nums[j]){
                temp.add(nums[i]);
                i++;
            }
            else{
                temp.add(nums[j]);
                j++;
                cnt+=(m-i+1);
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

        return cnt;
    }
    public static int mergeSort(int[] nums, int l, int h){
        int count=0;
        if(l>=h) return count; //base case

        int m = (l+h)/2;

        count+=mergeSort(nums,l,m); //divide
        count+=mergeSort(nums,m+1,h); //divide

        count+=merge(nums,l,m,h); //merge

        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Array: ");

        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Output: "+mergeSort(nums,0,n-1));
    }
}
