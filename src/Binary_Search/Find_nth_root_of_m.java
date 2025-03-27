package Binary_Search;

import java.util.Scanner;

public class Find_nth_root_of_m {
    public static int myPow(int x, int n){
        int ans=1;

        while(n>0){
            if(n%2==0){
                n=n/2;
                x=x*x;
            }
            else{
                n--;
                ans=ans*x;
            }
        }
        return ans;
    }
    public static int nthRoot(int n, int m){
        int s=1;
        int e=m;

        //T.C: O(logM * logN)

        while(s<=e){
            int mid = s + (e-s)/2;
            int val = myPow(mid,n);
            if(val==m){
                return mid;
            }
            else if(val > m){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }

        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(nthRoot(n,m));
    }
}
