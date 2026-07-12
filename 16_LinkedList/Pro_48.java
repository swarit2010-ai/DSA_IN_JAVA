/*Reverse the Circular Linked List
Difficulty: MediumAccuracy: 83.48%Submissions: 1K+Points: 4
You are given a Circular Linked List. Reverse the given circular linked list changing the links between the nodes.
Note:

You don't have to print anything, just return the head of the modified list in each function.
Nodes may consist of Duplicate values.
Examples:

Input:
    
Output: 10 -> 8 -> 7 -> 1
Explanation: After reversing the given circular linked list, we'll get 10 -> 8 -> 7 -> 1.
Input:
   
Output: 10 -> 8 -> 7 -> 5 -> 2
Explanation: After reversing the given circular linked list, we'll receive 10 -> 8 -> 7 -> 5 -> 2.
Constraints:
1 ≤ number of nodes ≤ 104
0 ≤ node -> data ≤ 104 */
public class Pro_48{
    public static void main(String[] args) {
    }
    public Node reverseCircular(Node head) {
        // code here
        if(head.next == head) return head;
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = null;
        if(head == null || head.next == null) return head;
        Node p = head;
        Node c = head;
        Node f = head.next;
        c.next = null;
        while(f != null){
            c = f;
            f = f.next;
            c.next = p;
            p = c;
        }
        head.next = temp;
        return temp;
    }
}