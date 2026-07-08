/*24. Swap Nodes in Pairs
Medium
Topics
premium lock icon
Companies
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 

Example 1:

Input: head = [1,2,3,4]

Output: [2,1,4,3]

Explanation:



Example 2:

Input: head = []

Output: []

Example 3:

Input: head = [1]

Output: [1]

Example 4:

Input: head = [1,2,3]

Output: [2,1,3]

 

Constraints:

The number of nodes in the list is in the range [0, 100].
0 <= Node.val <= 100 */

public class Pro_29{
    public static void main(String[] args) {
    }
    public Node swapPairs(Node head) {
        if(head == null || head.next == null) return head;
        Node dummy = new Node(-1);
        Node c = dummy;
        Node a = head;
        Node b = head.next;
        while(b != null){
            c.next = b;
            a.next = b.next;
            b.next = a;
            c = a;
            a = a.next;
            if(a == null) break;
            b = a.next;
        }
        return dummy.next;
    }
}