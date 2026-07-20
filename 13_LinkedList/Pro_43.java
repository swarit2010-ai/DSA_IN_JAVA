/*2. Add Two Numbers
Medium
Topics
premium lock icon
Companies
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807.
Example 2:

Input: l1 = [0], l2 = [0]
Output: [0]
Example 3:

Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
Output: [8,9,9,9,0,0,0,1]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros. */
public class Pro_43{
    public static void main(String[] args) {
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        int carry = 0;
        int sum = 0;
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while(t1 != null || t2 != null){
            if(t1 == null){
                sum = t2.val+carry;
                t2 = t2.next;
            }
            else if(t2 == null){
                sum = t1.val+carry;
                t1 = t1.next;
            }
            else{
                sum = t1.val+t2.val+carry;
                t1 = t1.next;
                t2 = t2.next;
            }
            ListNode node = new ListNode(sum%10);
            carry = sum/10;
            temp.next = node;
            temp = temp.next;
        }
        if(carry != 0){
            ListNode node = new ListNode(carry);
            temp.next = node;
            temp = temp.next;
        }
        temp.next = null;
        return ans.next;
    }
}