/* 61. Rotate List
Medium
Topics
premium lock icon
Companies
Given the head of a linked list, rotate the list to the right by k places.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [4,5,1,2,3]
Example 2:


Input: head = [0,1,2], k = 4
Output: [2,0,1]
 

Constraints:

The number of nodes in the list is in the range [0, 500].
-100 <= Node.val <= 100
0 <= k <= 2 * 109*/
public class Pro_18{
    public static void main(String[] args) {
    }
    public Node rotateRight(Node head, int k) {
        Node temp = head;
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        if(size == 0 || k % size == 0) return head;
        k = k % size;
        k = k+1;
        Node slow = head;
        Node fast = head;
        Node last = null;
        for(int i = 1;i <= k && fast != null;i++) {
            if(fast.next == null) last = fast;
            fast = fast.next;
        }
        
        while(fast != null){
            if(fast.next == null) last = fast;
            fast = fast.next;
            slow = slow.next;
        }
        last.next = head;
        head = slow.next;
        slow.next = null;
        return head;
    }
}