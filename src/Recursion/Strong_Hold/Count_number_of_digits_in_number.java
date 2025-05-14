package Recursion.Strong_Hold;

import java.util.Scanner;

public class Count_number_of_digits_in_number {
    public static int countDigits(int n){
        //base case
        if(n==0) return 0;

        int cnt=0;
        cnt = 1 + countDigits(n/10);

        return cnt;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(countDigits(n));
    }
}
