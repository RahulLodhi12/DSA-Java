package Recursion.Basic;

import java.util.Scanner;

public class Nth_Fibonacci_number {
    public static int fibb(int n){
        //base case
        if(n==0 || n==1) return n;

        return fibb(n-1) + fibb(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibb(n));
    }
}
