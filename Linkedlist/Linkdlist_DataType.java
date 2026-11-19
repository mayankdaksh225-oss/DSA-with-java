package Linkdlist;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}

class LinkedList{
    Node head;
    Node tail;
    int size;
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void deleteAthead(int val){
//        Node temp = head;
//        head = temp.next;
        if(head == null){
            System.out.println("List is Empty");
        }
        head = head.next;
//        if(head==null) tail = null;
        size--;
    } Node reorderList() {
        Node d = new Node(-1);
        Node t1 = d;
        Node s = head;
        Node f = head;
        while(f.next != null && f.next.next != null){
            s=s.next;
            f=f.next.next;
        }

        // Reverse list
        Node i = s.next;
        s.next = null;
        Node j = i.next;
        Node t = null;
        while(j != null){
            i.next = t;
            t = i;
            i = j;
            j= i.next;
        }
        i.next = t;

        // ADD linkedlist
        s = head;
        while(s != null && i != null){
            t1.next = s;
            t1 = s;
            t1.next = i;
            t1 = i;
            s=s.next;
            i=i.next;
        }
        t1.next = s;
        return d.next;
    }

    void deleteIndex(int idx){
        if(idx<0 || idx>=size){
            System.out.print("Invalid index");
            return;
        }
        if(idx==0){
            deleteAthead(idx);
            return;
        }
       Node temp = head;
        for(int i = 1; i<=idx-1; i++ ){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(idx==size-1) tail = temp;
        size--;
    }
    void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("Linked list is empty");
        }
       else{
            while (temp != null) {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
       }
    }
}
public class Linkdlist_DataType {
    static void main() {
        LinkedList a = new LinkedList();
        a.addAtTail(9);
        a.addAtTail(7);
        a.addAtTail(9);
        a.display();

        LinkedList b = new LinkedList();
        b.addAtTail(5);
        b.addAtTail(8);
        b.addAtTail(5);
        b.display();
//        System.out.println();
//        System.out.println(ll.size);
    }
}
