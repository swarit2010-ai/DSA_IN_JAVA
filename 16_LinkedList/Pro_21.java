/*Merge Sort for Linked List
Difficulty: MediumAccuracy: 74.76%Submissions: 92K+Points: 4Average Time: 30m
You are given the head of a linked list. You have to sort the given linked list using Merge Sort.

Examples:

Input:
    
Output: 10 -> 20 -> 30 -> 40 -> 50 -> 60
Explanation: After sorting the given linked list, the resultant list will be:
    
Input:
    
Output: 2 -> 5 -> 8 -> 9
Explanation: After sorting the given linked list, the resultant list will be:
    
Constraints:
1 ≤ number of nodes ≤ 105
0 ≤ node->data ≤ 106 */
public class Pro_21{
    public static void main(String[] args) {
    }
    public Node mergeSort(Node head) {
        // code here
        if(head.next == null) return head;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        Node h1 = mergeSort(head2);
        Node h2 = mergeSort(head);
        return mergeTwoLists(h1,h2);
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