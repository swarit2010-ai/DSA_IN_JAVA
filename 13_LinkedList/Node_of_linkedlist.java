//Creating a node

class Node{
    int val;
    Node next;
    Node(int val) {
        this.val = val;
    }
}

public class Node_of_linkedlist{
    public static void main(String[] args) {
        // Linked list = 10-20-30-40-50
        Node a = new Node(10);
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50); 
        // Connect or link the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        
        System.out.println(d.next); // printing address of e
        System.out.println(a.val); // printing value of a
        System.out.println(a.next.next.next.val); // -> d.val
        
    }
}