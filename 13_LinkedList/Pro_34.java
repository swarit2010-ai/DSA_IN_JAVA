/*Delete in a Singly Linked List
Difficulty: EasyAccuracy: 39.85%Submissions: 255K+Points: 2
You are given the head of a singly linked list and an integer x. Delete the xth node (1-based indexing) from the singly linked list.

Examples:

Input: x = 1,
    
Output: 2 -> 3 -> 1 -> 7
Explanation: After deleting the node at the 1st position (1-base indexing), the linked list is as
    
Input: x = 5,
    
Output: 2 -> 3 -> 4 -> 5
Explanation: After deleting the node at 5th position (1-based indexing), the linked list is as
    
Constraints:
1 ≤ size of linked list ≤ 105
1 ≤ x ≤ size of linked list */
public class Pro_34{
    public static void main(String[] args) {
    }
    Node deleteNode(Node head, int x) {
        // code here
        if(x == 1) return head.next;
        Node temp = head;
        for(int i = 1;i < x-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}