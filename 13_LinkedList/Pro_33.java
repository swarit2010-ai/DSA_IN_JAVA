/*Reorder List
Difficulty: HardAccuracy: 47.9%Submissions: 67K+Points: 8Average Time: 40m
Given a singly linked list: A0 →A1 →...→An-2 →An-1 , reorder it to A0 →An-1 →A1 →An-2 →A2 →An-3 →...
For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.

Note: Try to solve without using any auxiliary space.

Examples:

Input: LinkedList: 1->2->3
Output: 1->3->2
Explanation: Here n=3, so the correct order is A0 → A2 → A1

Input: LinkedList: 1->7->3->4
Output: 1->4->7->3
Explanation: Here n=4, so the correct order is A0 → A3 → A1 → A2 
Constraints:
1 <= no. of nodes <= 106
0 <= node->data <= 106 */
public class Pro_33{
    public static void main(String[] args) {
    }
    public void reorderList(Node head) {
        if (head == null || head.next == null) return;
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null;
        }
        Node b = reverse(slow);
        Node a = head;
        while (a != null && b != null) {
            Node aNext = a.next;
            Node bNext = b.next;
            a.next = b;
            if (aNext == null) {
                break;
            }
            b.next = aNext;
            
            a = aNext;
            b = bNext;
        }
    }
    
    public Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}