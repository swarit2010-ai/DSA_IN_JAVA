/*Circular Linked List Traversal
Difficulty: BasicAccuracy: 59.94%Submissions: 28K+Points: 1Average Time: 10m
Given the head of a circular linked list, print the data of the nodes in the linked list starting from the head node, traversing the list exactly once.

Examples:

Input:
 
Output: 1 7 8 10
Explanation: The traversal begins at the head node 1, then subsequent nodes 7, 8, and 10. 
Input:
 
Output: 2 5 7 8 10
Explanation: The traversal begins at head node 2, then subsequent nodes 5, 7, 8, and 10. 
Constraints: 
1 ≤ number of nodes ≤ 50
0 ≤ node -> data ≤ 500 */
public class Pro_45{
    public static void main(String[] args) {
    }
    public void printList(Node head) {
        // code here
        Node temp = head;
        do{
            System.out.print(temp.val + " ");
            temp = temp.next;
        }while(temp != head);
    }
}