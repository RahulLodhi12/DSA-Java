package Recursion.Basic;

import java.util.Scanner;

public class Sum_of_first_N_natural_numbers {
    public static int sum(int n){
        //base case
        if(n==1) return 1;

        return n+sum(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sum(n));
    }
}
