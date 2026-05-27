/*Kth from End of Linked List
Difficulty: EasyAccuracy: 41.18%Submissions: 459K+Points: 2Average Time: 30m
Given the head of a linked list and an integer k, return the kth node from the end of the linked list. If k is greater than the number of nodes in the list, return -1.

Examples :

Input: head: 1->2->3->4->5->6->7->8->9, k = 2
Output: 8
Explanation: 

The given linked list is 1->2->3->4->5->6->7->8->9. The 2nd node from end is 8.
Input: head: 10->5->100->5, k = 5
Output: -1
Explanation: 

The given linked list is 10->5->100->5. Since 'k' is more than the number of nodes, the output is -1.
Constraints:
1 ≤ number of nodes ≤ 106
1 ≤ node->data , x ≤ 106
1 ≤ k ≤ 106

 */
public class Pro_09{
    public static void main(String[] args) {
    }
    int getKthFromLast(Node head, int k) {
        // code here
        Node slow = head;
        Node fast = head;
        for(int i = 1;i <= k;i++){
            if(fast == null) return -1;
            fast = fast.next;
        }
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        return slow.val;
    }
}