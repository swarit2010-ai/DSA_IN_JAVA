/*First Node of Loop in Linked List
Difficulty: MediumAccuracy: 55.49%Submissions: 100K+Points: 4
You are given the head of a singly linked list. If a loop is present in the linked list then return the first node of the loop else return -1.

Note: Internally, pos(1 based index) is used to denote the position of the node that tail's next pointer is connected to. If pos = 0, it means the last node points to null, indicating there is no loop. Note that pos is not passed as a parameter.

Examples:

Input: pos = 2,
   
Output: 3
Explanation: We can see that there exists a loop in the given linked list and the first node of the loop is 3.
Input: pos = 0,
   
Output: -1
Explanation: No loop exists in the above linked list. So the output is -1.
Constraints:
1 ≤ no. of nodes ≤ 106
1 ≤ node->data ≤ 106  */
public class Pro_14{
    public static void main(String[] args) {
    }
    public int cycleStart(Node head) {
        // code here
        Node temp = head;
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                while(temp != slow){
                    temp = temp.next;
                    slow = slow.next;
                }
                return temp.val;
            }
        }
        return -1;
    }
}