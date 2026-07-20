/* Delete Middle of Linked List
Difficulty: EasyAccuracy: 54.52%Submissions: 152K+Points: 2Average Time: 20m
Given a singly linked list, delete the middle of the linked list.

Note:

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.
If the input linked list has a single node, then it should return NULL.
Examples:

Input: LinkedList: 1->2->3->4->5
Output: 1->2->4->5
Explanation:

Input: LinkedList: 2->4->6->7->5->1
Output: 2->4->6->5->1
Explaination:

Input: LinkedList: 7 
Output: <empty linked list>
Explanation: There was only one node and it was deleted.
Constraints:
1 <= number of nodes <= 105
1 <= node->data <= 109*/
public class Pro_08{
    public static void main(String[] args) {
    }
    Node deleteMid(Node head) {
        if(head == null || head.next == null) return null;
        Node slow = head;
        Node fast = head;
        Node prev = null;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return head;
    }
}