/*328. Odd Even Linked List
Medium
Topics
premium lock icon
Companies
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

The first node is considered odd, and the second node is even, and so on.

Note that the relative order inside both the even and odd groups should remain as it was in the input.

You must solve the problem in O(1) extra space complexity and O(n) time complexity.

 

Example 1:


Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]
Example 2:


Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
 

Constraints:

The number of nodes in the linked list is in the range [0, 104].
-106 <= Node.val <= 106 */
public class Pro_25{
    public static void main(String[] args) {
    }
    public Node oddEvenList(Node head) {
        Node odd = new Node(-1);
        Node even = new Node(-1);
        Node t1 = odd;
        Node t2 = even;
        Node temp = head;
        int idx = 1;
        while(temp != null){
            if(idx % 2 == 1){
                t1.next = temp;
                t1 = t1.next;
            }
            else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
            idx++;
        }
        t1.next = even.next;
        t2.next = null;
        return odd.next;
    }
}