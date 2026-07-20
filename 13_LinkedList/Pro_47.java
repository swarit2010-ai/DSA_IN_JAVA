/*Deletion in Circular Linked List
Difficulty: MediumAccuracy: 60.7%Submissions: 70K+Points: 4
You are given a Circular Linked List and an integer key representing a node. Delete the first occurrence of given key node in circular linked list and return the head of the modified linked list.
Note:

You don't have to print anything, just return the head of the modified list in each function.
The key may or may not be present.
Examples:

Input: key = 8,
    
Output: 1 -> 7 -> 10
Explanation: After deleting 8 from the given circular linked list, it has elements as 1, 7, 10.
    
Input: key = 8,
    
Output: 2 -> 5 -> 7 -> 10
Explanation: After deleting 8 from the given circular linked list, it has elements as 2, 5, 7, 10.
    
Constraints:
1 ≤ number of nodes ≤ 105
0 ≤ node -> val, key ≤ 105 */
public class Pro_47{
    public static void main(String[] args) {
    }
    Node deleteNode(Node head, int key) {
        // code here
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = null;
        if(head.val == key) head = head.next;
        Node temp2 = head;
        while(temp2.next != null && temp2.next.val != key){
            temp2 = temp2.next;
        }
        if(temp2.next == null){
            temp.next = head;
            return head;
        }
        if(temp2.next.next == null){
            temp2.next = head;
            return head;
        }
        temp2.next = temp2.next.next;
        temp.next = head;
        return head;
    }
}