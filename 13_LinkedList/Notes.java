/*
Problems in array:
1. Fixed size
2. Continuous memory location
3. Hard to add/delete ele in middle
Fayde:
Instantly get any ele in O(1)


Idea of linked list
Suppose there are many integer elements scattered around in the memory
with the particular address and the value
then a particular address or the node of the next node is present in 
the current node
the starting node is called head and the ending node is called
the tail
the head node points to the second and then so on
the tail node points to null
[Null is like void .It is known as the place of end of the memory]


Problems in linked list
We cannot access the elements in the middle so easily 
it needs traversal of the whole linked list
*/


public class Notes{
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20); 
        Node c = new Node(30); 
        Node d = new Node(40); 
        Node e = new Node(50);
        Node f = new Node(60);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        // displaying line by line
        display(a);
        System.out.println();
        // displaying line by line and then reverse
        // using recursion
        display_recur(a);
        // Getting an element
        System.out.println();
        System.out.println(get(a,2,0));
        System.out.println(get(a,2));
    }
    public static void display(Node head){
        // in while loop
        // Node temp = head; // temp gains head's reference
        // while(temp != null){
        //     System.out.print(temp.val + " ");
        //     temp = temp.next;
        // }
        // in for loop
        for(Node temp = head;temp != null;temp = temp.next){
            System.out.print(temp.val + " ");
        }
    }
    public static void display_recur(Node head){
        if(head == null) {
            System.out.println();
            return;
        }
        System.out.print(head.val + " ");
        display_recur(head.next);
        System.out.print(head.val + " ");
    }

    private static int get(Node a, int idx , int i) {
        if(i == idx){
            return a.val;
        }
        return(get(a.next, idx, i+1));
    }
    private static int get(Node head, int idx) {
        Node temp = head;
        for(int i = 0;i < idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
}