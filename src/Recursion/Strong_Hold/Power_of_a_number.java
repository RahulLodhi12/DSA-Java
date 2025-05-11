package Recursion.Strong_Hold;

import java.util.Scanner;

public class Power_of_a_number {
    public static int pow(int x, int n){ //x^n
        //base case
        if(n==0) return 1;

        if(n<0) return pow(1/x,-n);

        if(n%2==0){
            return pow(x*x,n/2);
        }
        return x*pow(x,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(pow(x,n));
    }
}
