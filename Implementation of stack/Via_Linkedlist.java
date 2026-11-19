package Implementation_of_Stack;

import java.util.ArrayList;

class Node{
    int val;
    Node next;
    Node(int val){
       this.val = val;
    }
}
class Stack{
    Node head;
    Node tail;
    int size;
    void push(int n){
        Node t = new Node(n);
        if(head == null){
            head=tail=t;
        }else{
            t.next = head;
            head = t;
        }
        size++;
    }
    int peek(){
        if(head == null){
            System.out.println("Stack is empty");
        }
        return head.val;
    }
    int pop(){
        int top=0;
       if(head!=null) {
           top = head.val;
       }
        if(head == null){
            System.out.print("Stack is empty");
        }else{
            head = head.next;
        }
        size--;
        return top;
    }
    ArrayList<Integer> print(){
        ArrayList<Integer> arr = new ArrayList<>();
        if(head == null){
            System.out.println("Stack is empty");
        }
        while(head != null){
            arr.add(head.val);
            head = head.next;
        }

        return arr;
    }

}
public class Via_Linkedlist {
    static void main() {
        Stack st = new Stack();
        st.push(50);
        st.push(40);
        st.push(30);
        st.push(20);
        st.push(10);
        st.push(5);
        st.pop();

//        System.out.println(st.peek());
//        System.out.println(st.size);
        System.out.println(st.print());
//        System.out.println(st.pop());
//        System.out.println(st.print());
    }
}
