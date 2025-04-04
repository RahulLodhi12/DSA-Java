package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Union_Of_Two_Sorted_Arrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();

        int n=a.length;
        int m=b.length;
        int i=0,j=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=a[i]){
                    ans.add(a[i]);
                }
                i++;
            }
            else if(a[i]==b[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=a[i]){
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
            else if(a[i]>b[j]){
                if(ans.size()==0 || ans.get(ans.size()-1)!=b[j]){
                    ans.add(b[j]);
                }
                j++;
            }
        }

        //remaining
        while(i<n){
            if(ans.size()==0 || ans.get(ans.size()-1)!=a[i]){
                ans.add(a[i]);
            }
            i++;
        }

        while(j<m){
            if(ans.size()==0 || ans.get(ans.size()-1)!=b[j]){
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        ArrayList<Integer> ans = findUnion(a,b);

        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
