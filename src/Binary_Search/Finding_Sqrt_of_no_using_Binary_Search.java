package Binary_Search;

import java.util.Scanner;

public class Finding_Sqrt_of_no_using_Binary_Search {
    public static int findSqrt_optimal(int n){
        int s=1,e=n;
        int ans=0;

        while(s<=e){
            int m = s + (e-s)/2;
            if(m*m>n){
                e=m-1;
            }
            else if(m*m<=n){
                ans=m;
                s=m+1;
            }
        }

        return ans;
    }
    public static int findSqrt_sqrt_inBuilt(int n){
        int ans = (int)Math.sqrt(n);
        return ans;
    }
    public static int findSqrt_bruteForce(int n){
        int ans=-1;

        for(int i=1;i<=n;i++){
            if(i*i<=n){
                ans=i;
            }
            else{
                return ans;
            }
        }

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        System.out.println("Output: " + findSqrt_bruteForce(n));

//        System.out.println("Output: " + findSqrt_sqrt_inBuilt(n));

        System.out.println("Output: " + findSqrt_optimal(n));
    }

}
