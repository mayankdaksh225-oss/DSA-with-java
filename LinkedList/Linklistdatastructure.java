package linklist_revision;

import org.w3c.dom.ls.LSOutput;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class linklist{
    Node head;
    Node tail;
    int size;

    void addAthead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
     boolean isPalindrome() {
        Node s = head;
        Node f = head;
        if(head == null || head.next == null){
            return true;
        }
        while(f.next != null && f.next.next != null){
            s = s.next;
            f = f.next;
        }
        Node a = s.next;
        s.next = null;
        // Reverse list
        Node t = null ;
        Node i = a;
        Node j = a.next;

        while(j != null){
                i.next = t;
                t = i;
                i = j;
                j = j.next;
        }
        i.next = t;

        s = head;
        while(s != null && i != null){
            System.out.print(s.val+" ");
            System.out.println(i.val);
            if(s.val != i.val){
                return false;
            }
            s = s.next;
            i = i.next;

        }
        return true;
    }
    void deletenode(int idx){
        Node temp = head;
        if(idx<0 || idx>=size){
            System.out.println("Invalid index");
            return;
        }
        if(idx==0) {
            deleteAtHead();
            return;
        }
        for(int i = 1; i<=idx-1; i++){
           temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1) tail=temp;
        size--;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        }else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }else{
            head=head.next;
        }
        size--;
    }
    void oddEven(Node head){
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node t1 = d1;
        Node t2 = d2;
        Node i = head;
        while(i != null){
            int a = i.val;
            if(a%2 == 0){
                t1.next = i;
                t1 = i;
                i = i.next;
            }else{
                t2.next = i;
                t2 = i;
                i = i.next;
            }
        }
        i.next = d2.next;
        t2.next = null;
    }
    void display(){
        Node temp = head;
        if(temp == null) System.out.println("Linkedlist is empty");
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
    }
    int  size(){
        Node temp = head;
        int count = 0;
        while(temp != null){
            temp=temp.next;
            count++;
        }
        size = count;
        return count;
    }
     void uniqueelements(){
        Node i = head;
        Node j = head;
        while(j != null){
            if(i.val == j.val ){
                j=j.next;
            }else{
                i.next = j;
                i=j;
            }
        }
        i.next = j;
    }
}
public class Linklistdatastructure {

    static void main() {
        linklist ll = new linklist();
        ll.addAthead(1);
        ll.addAtTail(1);
        ll.addAtTail(2);
        ll.addAtTail(1);
//        ll.addAthead(5);
//        ll.addAtTail(10);
//        ll.addAtTail(10);
//        ll.addAtTail(20);
//        ll.addAtTail(20);
//        ll.addAtTail(20);
////        ll.addAtTail(30);
//        ll.addAtTail(30);
//        ll.addAtTail(40);
//        ll.addAtTail(50);
//        ll.addAtTail(60);
//        ll.addAtTail(60);
//        ll.addAtTail(70);
//        ll.addAtTail(80);
//        ll.display();
        System.out.println(ll.isPalindrome());
//        ll.isPalindrome();
//        System.out.println();
//        System.out.println(ll.size);
//        ll.deleteAtHead();
//        ll.deletenode(3);
//        System.out.println();
//        ll.display();

//        System.out.println();
//        ll.uniqueelements();
//        System.out.println();
//        ll.display();
//        System.out.println();
//        System.out.println(ll.size);
//        Node.uniqueelements(a);
//        display(a);
    }
}
