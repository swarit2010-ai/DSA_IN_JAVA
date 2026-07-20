/*Middle of a Linked List
Difficulty: EasyAccuracy: 57.93%Submissions: 410K+Points: 2Average Time: 20m
You are given the head of a linked list, You have to return the value of the middle node of the linked list.

If the number of nodes is odd, return the middle node value.
If the number of nodes is even, there are two middle nodes, so return the second middle node value.
Examples:

Input: 
   
Output: 3
Explanation: The given linked list is 1->2->3->4->5 and its middle is 3.
   
Input:
   
Output: 7 
Explanation: The given linked list is 2->4->6->7->5->1 so, there are two middle node 6 and 7, return the second middle node as 7.
   
Constraints:
1 ≤ no. of nodes ≤ 105 */
public class Pro_07{
    public static void main(String[] args) {
    }
    int getMiddle(Node head) {
        // code here
        // Normal method :
        // Not a one pass solution
        // int size = 0;
        // Node temp = head;
        // while(temp != null){
        //     size++;
        //     temp = temp.next;
        // }
        // temp = head;
        // for(int i = 1;i <= size/2;i++){
        //     temp = temp.next;
        // }
        // return temp.val;
        // Slow and fast :
        // One pass :
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
}