/* 86. Partition List
Solved
Medium
Topics
premium lock icon
Companies
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

 

Example 1:


Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5]
Example 2:

Input: head = [2,1], x = 2
Output: [1,2]
 

Constraints:

The number of nodes in the list is in the range [0, 200].
-100 <= Node.val <= 100
-200 <= x <= 200*/
public class Pro_22{
    public static void main(String[] args) {
    }
    public Node partition(Node head, int x) {
        Node h1 = new Node(-1);
        Node h2 = new Node(-1);
        Node d1 = h1;
        Node d2 = h2;
        Node temp = head;
        while(temp != null){
            if(temp.val < x){
                d1.next = temp;
                d1 = d1.next;
            }
            else{
                d2.next = temp;
                d2 = d2.next;
            }
            temp = temp.next;
        }
        d1.next = h2.next;
        d2.next = null;
        return h1.next;
    }
}