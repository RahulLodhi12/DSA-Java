package Recursion.Basic;

import java.util.Scanner;

public class Print_numbers_from_1_to_N {

    public static void printNumbers(int n){
        //base case
        if(n==0) return;

        printNumbers(n-1); // Recursive call first

        System.out.println(n); // Print after recursion (so it prints 1 to N)
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printNumbers(n);
    }
}
