package Stack;

import com.sun.jdi.IntegerValue;

import java.util.Stack;

public class Traversing_on_stack2 {
    static void pushAtBottom(Stack<Integer> st,int n){
        if(st.size() == 0){
            st.push(n);
            return ;
        }
        int top = st.pop();
        pushAtBottom(st,n);
        st.push(top);
    }
    static void reverseStackRecursively(Stack<Integer> st){
        if(st.size() == 0){
            return;
        }
        int top = st.pop();
        reverseStackRecursively(st);
        pushAtBottom(st,top);
    }
    static int getIndex(Stack<Integer> st, int n ){
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>n+1){
            st2.push(st.pop());
        }
        int val = st.peek();
        while(st2.size()>0){
            st.push(st2.pop());
        }
        return val;
    }
    static Stack<Integer> reverse(Stack<Integer> st){
        Stack<Integer> st2 = new Stack<>();
        Stack<Integer> st3 = new Stack<>();

        while(st.size()>0){
            st2.push(st.pop());
        }
        while(st2.size()>0){
            st3.push(st2.pop());
        }
        while(st3.size()>0){
            st.push(st3.pop());
        }
        return st;
    }
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(5);
        st.push(4);
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println(st);
//        System.out.println(reverse(st));
        pushAtBottom(st,8);
        reverseStackRecursively(st);

        System.out.println(st);
        System.out.println(getIndex(st,3));
    }
}
