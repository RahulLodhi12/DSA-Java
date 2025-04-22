package Binary_Search;

import java.util.Arrays;
import java.util.Scanner;

public class Median_of_Two_Sorted_Arrays_of_different_sizes {
    public static double medianTwoSortedArray_betterApproach(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;

        int idx1=(n+m)/2;
        int idx2=idx1-1;

        int k=0; //index
        int i=0,j=0;

        int el1=-1,el2=-1;//answers

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                if(k==idx1) el1 = nums1[i];
                if(k==idx2) el2 = nums1[i];
                i++;
                k++;
            }
            else{
                if(k==idx1) el1 = nums2[j];
                if(k==idx2) el2 = nums2[j];
                j++;
                k++;
            }
        }

        while(i<n){
            if(k==idx1) el1 = nums1[i];
            if(k==idx2) el2 = nums1[i];
            i++;
            k++;
        }

        while(j<m){
            if(k==idx1) el1 = nums2[j];
            if(k==idx2) el2 = nums2[j];
            j++;
            k++;
        }

        // System.out.println(el1+" "+el2);

        if((n+m)%2==0) return (double)(el1+el2)/2;

        return el1;
    }
    public static double medianTwoSortedArray_bruteForce2(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;

        int[] temp = new int[n+m];

        int i=0,j=0;
        int k=0;

        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                temp[k++]=nums1[i];
                i++;
            }
            else{
                temp[k++]=nums2[j];
                j++;
            }
        }

        while(i<n){
            temp[k++]=nums1[i++];
        }

        while(j<m){
            temp[k++]=nums2[j++];
        }

        int len = temp.length;

        if(len%2==0){
            double median = (double)(temp[len/2] + temp[(len/2)-1])/2;
            return median;
        }

        return (double)temp[len/2];
    }
    public static double medianTwoSortedArray_bruteForce1(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;

        int[] temp = new int[n+m];

        int k=0;
        for(int i=0;i<n;i++){
            temp[k++]=nums1[i];
        }

        for(int i=0;i<m;i++){
            temp[k++]=nums2[i];
        }

        Arrays.sort(temp);
        int len = temp.length;

        if(len%2==0){
            double median = (double)(temp[len/2] + temp[(len/2)-1])/2;
            return median;
        }

        return (double)temp[len/2];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums1 = new int[n];

        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }

        System.out.println("Array 1: ");

        for(int i: nums1){
            System.out.print(i+" ");
        }

        System.out.println();

        int m = sc.nextInt();
        int[] nums2 = new int[m];

        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }

        System.out.println("Array 2: ");

        for(int i: nums2){
            System.out.print(i+" ");
        }

        System.out.println();

//        System.out.println("Output: " + medianTwoSortedArray_bruteForce1(nums1,nums2));

//        System.out.println("Output: " + medianTwoSortedArray_bruteForce2(nums1,nums2));

        System.out.println("Output: " + medianTwoSortedArray_betterApproach(nums1,nums2));
    }
}
