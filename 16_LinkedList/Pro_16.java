/* 82. Remove Duplicates from Sorted List II
Medium
Topics
premium lock icon
Companies
Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.

 

Example 1:


Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]
Example 2:


Input: head = [1,1,1,2,3]
Output: [2,3]
 

Constraints:

The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.*/
public class Pro_16{
    public static void main(String[] args) {
    }
    public Node deleteDuplicates(Node head) {
        Node d1 = head;
        Node d2 = head;
        Node t1 = new Node(-1);
        Node t = t1;
        while(d2 != null){
            while(d2 != null && d1.val == d2.val  ) d2 = d2.next;
            if(d1.next == d2) {
                t.next = d1;
                t = t.next;
            }
            else if(d2 == null) t.next = null;
            d1.next = d2;
            d1 = d1.next;
        }
        return t1.next;
    }
}