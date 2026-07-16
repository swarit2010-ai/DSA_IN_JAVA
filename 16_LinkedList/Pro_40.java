/*138. Copy List with Random Pointer
Medium
Topics
premium lock icon
Companies
Hint
A linked list of length n is given such that each ListNode contains an additional random pointer, which could point to any ListNode in the list, or null.

Construct a deep copy of the list. The deep copy should consist of exactly n brand new ListNodes, where each new ListNode has its value set to the value of its corresponding original ListNode. Both the next and random pointer of the new ListNodes should point to new ListNodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to ListNodes in the original list.

For example, if there are two ListNodes X and Y in the original list, where X.random --> Y, then for the corresponding two ListNodes x and y in the copied list, x.random --> y.

Return the head of the copied linked list.

The linked list is represented in the input/output as a list of n ListNodes. Each ListNode is represented as a pair of [val, random_index] where:

val: an integer representing ListNode.val
random_index: the index of the ListNode (range from 0 to n-1) that the random pointer points to, or null if it does not point to any ListNode.
Your code will only be given the head of the original linked list.

 

Example 1:


Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
Example 2:


Input: head = [[1,1],[2,1]]
Output: [[1,1],[2,1]]
Example 3:



Input: head = [[3,null],[3,0],[3,null]]
Output: [[3,null],[3,0],[3,null]]
 

Constraints:

0 <= n <= 1000
-104 <= ListNode.val <= 104
ListNode.random is null or is pointing to some ListNode in the linked list. */
public class Pro_40{
    public static void main(String[] args) {
    }
    public ListNode deepCopy(ListNode head1){
        ListNode head2 = new ListNode(-1);
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1 != null){
            ListNode new_ListNode = new ListNode(temp1.val);
            temp2.next = new_ListNode;
            temp2 = new_ListNode;
            temp1 = temp1.next;
        }
        temp2.next = null;
        return head2.next;
    }
    public void merge(ListNode head1,ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp2 != null){
            temp.next = temp1;
            temp1 = temp1.next;
            temp = temp.next;
            temp.next = temp2;
            temp2 = temp2.next;
            temp = temp.next;
        }
    }
    public void randomConnections(ListNode head1,ListNode head2){
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp1 != null){
            if(temp1.random == null) temp2.random = null;
            else temp2.random = temp1.random.next;
            temp1 = temp1.next.next;
            if(temp2.next != null) temp2 = temp2.next.next;
        }
    }
    public void split(ListNode head1){
        ListNode dummy1 = new ListNode(-1);
        ListNode dummy2 = new ListNode(-1);
        ListNode temp1 = dummy1;
        ListNode temp2 = dummy2;
        ListNode temp = head1; 
        while(temp != null){
            temp1.next = temp;
            temp = temp.next;
            temp1 = temp1.next;
            temp2.next = temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        temp1.next = null;
    }
    public ListNode copyRandomList(ListNode head1) {
        // Step1 = Creating deep copy without random
        ListNode head2 = deepCopy(head1);
        // Step2 = Alternatively connecting lists
        merge(head1,head2);
        // Step3 = Assigning random pointers
        randomConnections(head1,head2);
        // Step4 = Splitting into two
        split(head1);
        return head2;
    }
}