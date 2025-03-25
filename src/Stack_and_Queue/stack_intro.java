package Stack_and_Queue;
import java.util.*;

public class stack_intro {
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        System.out.println("Stack: "+st);

        System.out.println("Top Element: "+st.peek());

        st.pop();

        System.out.println("Stack after 1 pop operation: "+st);

        System.out.println("Stack is Empty or Not: "+st.isEmpty());

        System.out.println("Found 20 at index: "+st.search(20));
    }
}
