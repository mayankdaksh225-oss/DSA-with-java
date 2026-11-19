package Stack;
import java.util.Stack;
public class Traversing_on_stack {
    static Stack<Integer> st = new Stack<>();
    static Stack<Integer> st2 = new Stack<>();
    static void pushAtBottom( int n){
        if(st.isEmpty()){
            st.push(n);
            return;
        }
        st2.push(st.pop());
        pushAtBottom(n);
        st.push(st2.pop());
    }
    static void reverseStack(){
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
    }
    static void reverseStackRecursively(){
        if(st.size()==0){
            return;
        }
        int top = st.pop();
        reverseStackRecursively();
       pushAtBottom(top);
    }
    static void getindex(int n){
        while(st.size()>n+1){
            st2.push(st.pop());
        }
        System.out.println(st.peek());
        while(st2.size()>0){
            st.push(st2.pop());
        }
    }
    static void main(String[] args) {
        st.push(40);
        st.push(90);
        st.push(50);
        st.push(60);
        st.push(70);
        st.push(10);

        // Traversing the stack
        while(st.size()>0) {
            int top = st.pop();
            System.out.print(top + " ");
            st2.push(top);
        }
        while(st2.size()>0) {
            st.push(st2.pop());
        }
//        System.out.println(st);
        System.out.println();
        getindex(6);
        System.out.println("Before reverse");
        System.out.println(st);
        reverseStackRecursively();
        System.out.println("After reverse");
        System.out.println(st);
//        reverseStack();
//        System.out.println(st);
//        pushAtBottom(100);
//        System.out.println(st);

    }
}
