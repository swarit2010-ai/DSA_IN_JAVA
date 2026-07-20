/*21. Merge Two Sorted Lists
Solved
Easy
Topics
premium lock icon
Companies
You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
Example 2:

Input: list1 = [], list2 = []
Output: []
Example 3:

Input: list1 = [], list2 = [0]
Output: [0]
 

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order. */
public class Pro_20{
    public static void main(String[] args) {
    }
    public Node mergeTwoLists(Node h1, Node h2) {
        Node t1 = h1;
        Node t2 = h2;
        Node head = new Node(-1);
        Node t = head;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                t.next = t1;
                t1 = t1.next;
            }
            else{
                t.next = t2;
                t2 = t2.next;
            }
            t = t.next;
        }
        if(t1 == null) t.next = t2;
        else t.next = t1;
        return head.next;
    }
}