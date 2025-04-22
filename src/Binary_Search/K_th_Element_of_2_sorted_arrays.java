package Binary_Search;

import java.util.Scanner;

public class K_th_Element_of_2_sorted_arrays {
    public static int kTH_Element_2SortedArray_betterApproach(int[] num1, int[] num2, int k){
        int n=num1.length;
        int m=num2.length;

        int idx=1;
        int i=0,j=0;
        while(i<n && j<m){
            if(num1[i]<=num2[j]){
                if(idx==k){
                    return num1[i];
                }
                i++;
                idx++;
            }
            else{
                if(idx==k){
                    return num2[j];
                }
                j++;
                idx++;
            }
        }

        while(i<n){
            if(idx==k){
                return num1[i];
            }
            i++;
            idx++;
        }

        while(j<m){
            if(idx==k){
                return num2[j];
            }
            j++;
            idx++;
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num1 = new int[n];

        for(int i=0;i<n;i++){
            num1[i]=sc.nextInt();
        }

        int m = sc.nextInt();
        int[] num2 = new int[m];

        for(int i=0;i<m;i++){
            num2[i]=sc.nextInt();
        }

        System.out.println("Array 1: ");
        for(int i: num1){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Array 2: ");
        for(int i: num2){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("Enter k");
        int k = sc.nextInt();

        System.out.println("Output: " + kTH_Element_2SortedArray_betterApproach(num1,num2,k));
    }
}
