class Linkedlist{
    Node head;
    Node tail;
    int size;
    boolean search(int val){
        if(head == null) return false;
        Node temp = head;
        while(temp != null){
            if(temp.val == val) return true;
            temp = temp.next;
        }
        return false;
    }
    void addAtHead(int val) {
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void display() {
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    void deleteAtHead(){
        if(head.val == tail.val){
            head = tail = null;
            return;
        }
        if(head == null){
            System.out.println("List is empty !");
            return;
        }
        head = head.next;
        size--;
    }
}

public class LinkedListDataStructure{
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10); ll.addAtTail(20);
        ll.addAtTail(30); ll.addAtTail(40);
        // ll.display();
        // System.out.println(ll.size);
        // ll.addAtHead(50);
        // ll.display();
        // ll.deleteAtHead();
        // ll.deleteAtHead();
        // ll.deleteAtHead();
        // ll.deleteAtHead();
        // ll.deleteAtHead();
        // ll.addAtTail(10); ll.addAtTail(20);
        // ll.addAtTail(30); ll.addAtTail(40);
        // System.out.println(ll.search(40));
        // ll.display();
        
    }
}
