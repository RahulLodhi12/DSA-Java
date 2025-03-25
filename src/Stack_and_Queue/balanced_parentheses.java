package Stack_and_Queue;
import java.util.*;

public class balanced_parentheses {
    public static boolean isBalanced(String str){
        if(str.length()%2!=0) return false;
        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){ //opening parentheses
                st.push(ch);
            }
            else if(!st.isEmpty()){ //closing parentheses
                char top = st.peek();
                if(top=='(' && ch==')'){
                    st.pop();
                }
                else if(top=='{' && ch=='}'){
                    st.pop();
                }
                else if(top=='[' && ch==']'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
            else{ //only closing parentheses in the string.
                return false;
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println("Parentheses are Balanced or Not: "+isBalanced(str));
    }
}
