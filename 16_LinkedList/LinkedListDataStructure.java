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
    void delete(int idx) {
        if(idx < 0 || idx >= size) System.out.println("Index out of bound");
        else if(idx == 0) deleteAtHead();
        else{
            Node temp = head;
            for(int i = 1;i <= idx-1;i++) temp = temp.next;
            temp.next = temp.next.next;
            if(idx == size-1) tail = temp;
            size--;
        }
    }
    void insert(int idx,int val){
        if(idx > size || head == null || idx < 0){
            System.out.println("Index out of bound.");
        }
        else if(idx == size) addAtTail(val);
        else if(idx == 0) addAtHead(val);
        else{
            Node temp = head;
            Node temp1 = new Node(val);
            for(int i = 1;i < idx;i++) temp = temp.next;
            temp1.next = temp.next;
            temp.next = temp1;
            size++;
        }
    }
    int get(int idx) {
        Node temp = head;
        for(int i = 0;i < idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}

public class LinkedListDataStructure{
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.addAtTail(10); ll.addAtTail(20);
        ll.addAtTail(30); ll.addAtTail(40);
        ll.display();
        System.out.println(ll.size);
        ll.addAtHead(50);
        ll.display();
        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.deleteAtHead();
        ll.addAtTail(10); ll.addAtTail(20);
        ll.addAtTail(30); ll.addAtTail(40);
        System.out.println(ll.search(40));
        ll.display();
        ll.insert(0, 15);
        ll.display();
        System.out.println(ll.get(0));
        ll.delete(2);
        ll.display();
    }
}