/*1721. Swapping Nodes in a Linked List
Medium
Topics
premium lock icon
Companies
Hint
You are given the head of a linked list, and an integer k.

Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]
 

Constraints:

The number of nodes in the list is n.
1 <= k <= n <= 105
0 <= Node.val <= 100 */
public class Pro_11{
    public static void main(String[] args) {
    }
    public Node swapNodes(Node head, int n) {
        Node slow = head;
        Node fast = head;
        for(int i = 1;i <= n && fast != null;i++) fast = fast.next;
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        int a = slow.val;
        Node temp = head;
        for(int i = 1;i < n;i++) temp = temp.next;
        int b = temp.val;
        temp.val = a;
        slow.val = b;
        return head;
    }
}