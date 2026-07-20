/*445. Add Two Numbers II
Medium
Topics
premium lock icon
Companies
You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 

Example 1:


Input: l1 = [7,2,4,3], l2 = [5,6,4]
Output: [7,8,0,7]
Example 2:

Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [8,0,7]
Example 3:

Input: l1 = [0], l2 = [0]
Output: [0]
 

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
 

Follow up: Could you solve it without reversing the input lists? */
public class Pro_44{
    public static void main(String[] args) {
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = reverse(l1);
        l2 = reverse(l2);
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
        ans = reverse(ans.next);
        return ans;
    }
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode p = head;
        ListNode c = head;
        ListNode f = head.next;
        c.next = null;
        while(f != null){
            c = f;
            f = f.next;
            c.next = p;
            p = c;
        }
        return c;
    }
}