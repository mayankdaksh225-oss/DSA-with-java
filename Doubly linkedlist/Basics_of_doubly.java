package Doubly_linkedlist;

class Node {
    int val;
    Node next;
    Node prev;
    Node(int val){
        this.val = val;
    }
}
class dll{
    Node head;
    Node prev;
    Node tail;
    int size;
    void addAtHead(int val){
        Node t = new Node(val);
        if(head == null){
            head = tail = t;
        }else{
            t.next = head;
            head.prev = t;
            head = t;
        }
        size++;
    }
    void addAtTail(int val){
        Node t = new Node(val);
        if(tail == null){
            head = tail = t;
        }else{
            tail.next = t;
            t.prev = tail;
            tail = t;
        }
        size++;
    }
    void deleteAtTail(){
        if(tail.prev == null){
            head=tail=null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }

        size--;
    }
    void InsertAtAnyIndex(int val, int idx){
        if(idx> size || idx == size || idx <0){
            System.out.print("Invalid index");
            return;
        }
        if(size == 0){
            addAtHead(val);
        }
        Node temp = new Node(val);
        Node t = head;
        for(int i = 1; i<=idx-1; i++){
            t = t.next;
        }
        temp.next = t.next;
        t.next.prev = temp;
        t.next = temp;
        temp.prev = t;
        size++;
    }
    void displayReverse(){
        Node temp= tail;
        if(temp == null){
            System.out.println("List is empty");
        }
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
    }
    void deleteAtHead(){
        if(head.next == null){
            head =tail = null;
        }else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty");
        }else{
            while(temp != null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
        }

//        System.out.println("size is: "+size);
    }
}
public class Basics_of_doubly {
    static void main() {
        dll a = new dll();
        a.addAtHead(5);
        a.addAtTail(10);
        a.addAtTail(20);
        a.addAtTail(30);
        a.addAtTail(40);
        a.addAtTail(50);
//        a.deleteAtTail();
        a.display();
        a.InsertAtAnyIndex(45,7);
        System.out.println();
        a.display();
//        a.displayReverse();
        System.out.println();
        System.out.println("size is: "+a.size);
    }
}
