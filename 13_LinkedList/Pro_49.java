/* Reverse a Doubly Linked List
Difficulty: EasyAccuracy: 70.38%Submissions: 222K+Points: 2Average Time: 15m
Given the head of a doubly linked list. You have to reverse the doubly linked list and return its head.

Note: The driver code will print the returned list in both forward and backward directions.

Examples:

Input:
   
Output: 
5 4 3
3 4 5
Explanation: After reversing the given doubly linked list the new list will be 5 <-> 4 <-> 3.
   
Input: 
   
Output: 
196 59 122 75
75 122 59 196
Explanation: After reversing the given doubly linked list the new list will be 196 <-> 59 <-> 122 <-> 75.
   
Constraints:
1 ≤ number of nodes ≤ 106
0 ≤ node->data ≤ 104*/
public class Pro_49{
    public static void main(String[] args) {
    }
    public ListNode reverse(ListNode head) {
        // code here
        // Three Pointers
        // Node p = null;
        // Node c = head;
        // Node f = head;
        // while(c != null){
        //     f = c.next;
        //     c.next = p;
        //     c.prev = f;
        //     p = c;
        //     c = f;
        // }
        // return p;
        // Two pointers
        if(head.next == null) return head;
        ListNode p = null;
        ListNode c = head;
        while(c != null){
            p = c.prev;
            c.prev = c.next;
            c.next = p;
            c = c.prev;
        }
        return p.prev;
    }
}