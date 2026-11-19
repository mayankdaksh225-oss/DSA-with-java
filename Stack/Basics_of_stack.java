package Stack;
import java.util.*;
class Basics_of_stack {
    static void main() {
        Stack<String> st = new Stack<>();
//        System.out.println(st.peek());
//        System.out.println(st.isEmpty()); // it will give true;
//        System.out.println(st.size()==0); // it will give true;
        st.push("pubg");
        st.push("free fire");
        st.push("god of war");
        st.push("spider man");
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st);

        st.pop();
        System.out.println(st);

        System.out.println(st.peek());

        System.out.println(st.pop());

        System.out.println(st);
    }
}
