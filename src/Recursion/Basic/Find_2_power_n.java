package Recursion.Basic;

import java.util.Scanner;

//2^n
public class Find_2_power_n {
    public static int pow(int n){
        //base case
        if(n==0) return 1;

        return 2*pow(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(pow(n)); //2^n
    }
}
