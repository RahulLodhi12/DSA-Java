package Recursion.Basic;

import java.util.Scanner;

public class Source_to_Destination {
    public static void pathWay(int src, int dest){
        System.out.println("Source: "+src+" Destination: "+dest);

        //base case
        if(src==dest){
            System.out.println("Reached!!");
            return;
        }

        pathWay(src+1,dest);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int src = sc.nextInt();
        int dest = sc.nextInt();

        pathWay(src,dest);
    }
}
