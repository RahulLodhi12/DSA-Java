package Recursion.Strong_Hold;

import java.util.Scanner;

public class GCD_of_two_numbers {
    public static int gcd_naive(int a, int b){
        int res = Math.min(a, b);

        while(res>0){
            if(a%res==0 && b%res==0) return res;
            res--;
        }

        return -1;
    }

    public static int gcd_recursive(int a, int b){
        //base case
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;

        if(a>b) return gcd_recursive(a-b,b);
        return gcd_recursive(a,b-a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

//        System.out.println(gcd_naive(a,b));

        System.out.println(gcd_recursive(a,b));
    }
}
