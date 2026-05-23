import java.util.*;
/* Print Linked List
Difficulty: BasicAccuracy: 60.71%Submissions: 186K+Points: 1
You are given the head of a singly linked list. Return an array containing the values of the nodes.

Examples:

Input:
    
Output: [1, 2, 3, 4, 5]
Explanation: The linked list contains 5 elements [1, 2, 3, 4, 5]. The elements are printed in a single line.
Input:
    
Output: [10, 20, 30, 40, 50, 60]
Explanation: The linked list contains 5 elements [10, 20, 30, 40, 50, 60]. The elements are printed in a single line.
Constraints :
1 ≤ numbers of nodes ≤ 105
1 ≤ node values ≤ 106
*/
public class Pro_01{
    public static void main(String[] args) {
    }
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Node temp = head;
        while(temp != null) {
            ans.add(temp.val);
            temp = temp.next;
        }
        return ans;
    }
}