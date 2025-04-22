package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Two_Sorted_Arrays_Without_Extra_Space {
    public static void mergeTwoSortedArrays_optimal(int[] nums1, int[] nums2){
        int n=nums1.length;
        int m=nums2.length;

        int i=n-1,j=0;

        while(i>=0 && j<m){
            if(nums1[i]>nums2[j]){
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i--;
                j++;
            }
            else{
                break;
            }
        }

        Arrays.sort(nums1);
        Arrays.sort(nums2);


        for(int it: nums1){
            System.out.print(it+" ");
        }

        System.out.println();

        for(int it: nums2){
            System.out.print(it+" ");
        }
    }
    public static void mergeTwoSortedArrays_bruteForce(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;

        int i=0,j=0;

        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
            }
            else{
                System.out.print(arr2[j]+" ");
                j++;
            }
        }

        //remaining
        while(i<n){
            System.out.print(arr1[i]+" ");
            i++;
        }

        while(j<m){
            System.out.print(arr2[j]+" ");
            j++;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for(int i=0;i<n;i++){
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<m;i++){
            arr2[i] = sc.nextInt();
        }

//        mergeTwoSortedArrays_bruteForce(arr1,arr2);

        mergeTwoSortedArrays_optimal(arr1,arr2);
    }
}
