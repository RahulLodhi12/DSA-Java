package Recursion.Strong_Hold;

public class Print_all_subsets_of_string {
    public static void printSubSets(String str, String curr, int idx){
        //base case
        if(idx==str.length()){
            System.out.println(curr);
            return;
        }

        //take
        printSubSets(str,curr+str.charAt(idx),idx+1);

        //skip
        printSubSets(str,curr,idx+1);
    }
    public static void main(String[] args){
        String str="abc";

        System.out.println("All Subsets:");

        printSubSets(str,"",0);
    }
}
