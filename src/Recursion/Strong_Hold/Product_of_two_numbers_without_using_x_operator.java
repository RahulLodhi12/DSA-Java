package Recursion.Strong_Hold;

import java.util.Scanner;

//product of two numbers (without using * operator)
public class Product_of_two_numbers_without_using_x_operator {
    public static int product(int a, int b){
        //base case
        if(b==0) return 0;

        return a + product(a,b-1); //use '+' operator
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(product(a,b));
    }
}
