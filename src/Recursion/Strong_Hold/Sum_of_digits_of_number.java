package Recursion.Strong_Hold;

import java.util.Scanner;

public class Sum_of_digits_of_number {
    public static int sumDigits(int n){
        //base case
        if(n==0) return 0;

        return n%10 + sumDigits(n/10);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(sumDigits(n));
    }
}
