class ListNode{
    int val;
    ListNode next;
    ListNode prev;
    ListNode child;
    ListNode random;
    ListNode(int val){
        this.val = val;
    }
}
class DLL{
    ListNode head;
    ListNode tail;
    int size;
    void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
    void display_reverse(){
        ListNode temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
    }
    void insertAtHead(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        size++;
    }
    void insertAtTail(int val){
        ListNode temp = new ListNode(val);
        if(head == null) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        size++;
    }
    void deleteAtHead(){
        if(size == 0) return;
        if(size == 1) head = tail = null;
        else{
            head = head.next;
            head.prev = null;
        }
        size--;
    }
    void deleteAtTail(){
        if(size == 0) return;
        if(size == 1) head = tail = null;
        else{
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }
    void insert(int idx,int val){
        if(idx < 0 || idx > size) return;
        if(idx == size){
            insertAtTail(val);
            return;
        }
        ListNode temp = head;
        ListNode new_node = new ListNode(val);
        if(size == 0) head = tail = new_node;
        else{
            for(int i = 1;i <= idx-1;i++){
                temp = temp.next;
            }
            new_node.prev = temp;
            new_node.next = temp.next;
            temp.next = new_node;
            new_node.next.prev = new_node;
        }
        size++;
    }
}
public class DoublyLinkedListClass {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtHead(10);
        list.insertAtTail(50);
        // list.display();
        list.deleteAtHead();
        // list.display();
        list.deleteAtTail();
        list.insertAtHead(50);
        list.insertAtHead(10);
        list.display();
        System.out.println();
        list.display_reverse();
        System.out.println();
        list.insert(2, 10);
        list.display();
    }
}
