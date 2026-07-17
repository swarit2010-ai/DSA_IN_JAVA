/*Remove duplicates from a sorted DLL
Difficulty: EasyAccuracy: 50.36%Submissions: 89K+Points: 2Average Time: 10m
Given a doubly linked list of n nodes sorted by values, remove duplicate nodes present in the linked list.

Examples:

Input: head: 1<->1<->1<->2<->3<->4
Output: 1<->2<->3<->4
Explanation: Only the first occurance of node with value 1 is retained along with other distinct values. 
Input: head: 1<->2<->2<->3<->3<->4<->4
Output: 1<->2<->3<->4
Explanation:
Only the first occurance of nodes with values 2, 3 and 4 are retained, rest repeating nodes are deleted.
Constraint:
1 ≤ n ≤ 105 */
public class Pro_51{
    public static void main(String[] args) {
    }
    ListNode removeDuplicates(ListNode head) {
        // code here
        ListNode t1 = head;
        ListNode t2 = head;
        while(t2 != null){
            while(t2 != null && t1.val == t2.val) t2 = t2.next;
            t1.next = t2;
            if(t2 != null) t2.prev = t1;
            t1 = t2;
        }
        return head;
    }
}