package Linkdlist;

import java.util.*;


class Display{
    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
//        if(head == null) return;
//        System.out.print(head.val+" ");
//        display(head.next);
    }
}
class Index {
    public static void get(Node head, int val) {
        Node temp = head;
        for (int i = 1; i < val; i++) {
            temp= temp.next;
        }
        System.out.println(temp.val);
    }
}
public class Nodes_of_Linklist {
//    public static void print(Node head){
//        System.out.println(head.val);
//    }
    public static int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
//        System.out.println("size of linkedlist: "+count);
        return count;
    }
    static void main() {
        Scanner input = new Scanner(System.in);
        Node a = new Node(input.nextInt());
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        // Connect
        a.next = b;
        b.next =c ;
        c.next = d;
        d.next = e;
        e.next = f;
        Display.display(a);
        System.out.println();
        Index.get(a,3);
        System.out.println(size(a));

    }

}
