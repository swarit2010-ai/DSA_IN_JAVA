/* Add Number Linked Lists
Difficulty: MediumAccuracy: 34.52%Submissions: 391K+Points: 4Average Time: 30m
You are given the head of two singly linked lists head1 and head2 representing two non-negative integers. You need to return the head of the linked list representing the sum of these two numbers.

Note: There can be leading zeros in the input lists, but there should not be any leading zeros in the output list.

Examples:

Input: 
    
Output:  1 -> 1 -> 2 -> 2
Explanation: Given numbers are 123 and 999. There sum is 1122.
    
Input: 
    
Output: 7 -> 0 
Explanation: Given numbers are 63 and 7. There sum is 70.
    
Constraints:
1 ≤ Number of nodes in head1, head2 ≤ 105
0 ≤ node->val ≤ 9*/
public class Pro_39{
    public static void main(String[] args) {
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node rev1 = reverse(head1);
        Node rev2 = reverse(head2);
        Node temp1 = rev1;
        Node temp2 = rev2;
        int carry = 0;
        int sum = 0;
        Node ans = new Node(-1);
        Node travel = ans;
        while(temp1 != null || temp2 != null){
            if(temp1 == null){
                sum = temp2.val+carry;
                temp2 = temp2.next;
            }
            else if(temp2 == null){
                sum = temp1.val+carry;
                temp1 = temp1.next;
            }
            else {
                sum = temp1.val+temp2.val+carry;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            Node add = new Node(sum%10);
            travel.next = add;
            travel = travel.next;
            carry = sum/10;
        }
        if(carry != 0){
            Node add = new Node(carry);
            travel.next = add;
        }
        ans = ans.next;
        ans = reverse(ans);
        while(ans.val == 0 && ans.next != null) ans = ans.next;
        return ans;
    }
    public Node reverse(Node head){
        if(head == null || head.next == null) return head;
        Node p = head;
        Node c = head;
        Node f = head.next;
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