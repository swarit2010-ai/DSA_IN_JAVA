/*Length of Circular Linked List
Difficulty: BasicAccuracy: 86.98%Submissions: 7K+Points: 1Average Time: 15m
Given a circular linked list of size n, find the length of the list (total number of nodes).
Note: The tail of the circular linked list is connected to head.

Examples:

Input:
 
Output: 5
Input: 

Output: 6
Constraints:
1 ≤ nodes ≤ 103 */
public class Pro_28{
    public static void main(String[] args) {
    }
    public static int getLength(Node head) {
        // code here
        if(head == null) return 0;
        Node temp = head.next;
        int size = 1;
        while(temp != head){
            size++;
            temp = temp.next;
        }
        return size;
    }
}