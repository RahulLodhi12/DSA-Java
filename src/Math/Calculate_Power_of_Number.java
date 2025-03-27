package Math;

import java.util.Scanner;

public class Calculate_Power_of_Number {
    public static double myPow(double x, int n) {
        double ans=1;

        long orgPow=n;
        if(orgPow<0){
            n=-n;
        }

        while(n>0){ //reducing power
            if(n%2==0){ //even
                x=x*x;
                n=n/2;
            }
            else{ //odd
                ans=ans*x;
                n--;
            }
        }

        if(orgPow<0) return 1/ans;

        return Math.round(ans*1000.0)/1000.0; //for 4 digits after decimal
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble(); //base
        int n = sc.nextInt(); //power

        System.out.println("Output:" + myPow(x,n));
    }
}
