package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Count_Reverse_Pairs {
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
    public static int cntReversePairs(int[] nums, int l, int m, int h){
        int cnt=0;
        int j=m+1;
        for(int i=l;i<=m;i++){
            while(j<=h && nums[i]>2*nums[j]){
                j++;
            }
            cnt += (j-(m+1));
        }
        return cnt;
    }
    public static int mergeSort(int[] nums, int l, int h){
        int count=0;
        if(l>=h) return count; //base case

        int m = (l+h)/2;

        count += mergeSort(nums,l,m); //divide
        count += mergeSort(nums,m+1,h); //divide

        count += cntReversePairs(nums,l,m,h);

        merge(nums,l,m,h); //merge

        return count;
    }
    public static int countReversePairs_optimal(int[] nums){
        return mergeSort(nums,0,nums.length-1);
    }
    public static int countReversePairs_bruteForce(int[] nums){
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]>((long)2*nums[j])){
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        int[] nums = new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

        System.out.println("Array:");
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();

//        System.out.println("Output: " + countReversePairs_bruteForce(nums));

        System.out.println("Output: " + countReversePairs_optimal(nums));
    }
}
