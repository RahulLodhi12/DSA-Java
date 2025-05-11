package Recursion.Strong_Hold;

import java.util.Scanner;

public class Check_string_is_palindrome {
    public static boolean isPalindrome_iterative(String str){
        int s=0,e=str.length()-1;

        while(s<e){
            if(str.charAt(s)!=str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
    }

    public static boolean isPalindrome_recursive(String str, int s, int e){
        //base case
        if(s>=e) return true;
        if(str.charAt(s)!=str.charAt(e)) return false;

        return isPalindrome_recursive(str,s+1,e-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

//        System.out.println(isPalindrome_iterative(str));

        System.out.println(isPalindrome_recursive(str,0,str.length()-1));
    }
}
