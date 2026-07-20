/*Palindrome Linked List
Difficulty: MediumAccuracy: 41.48%Submissions: 398K+Points: 4Average Time: 20m
You are given the head of a singly linked list of positive integers. You have to check if the given linked list is palindrome or not.

Examples:

Input:
   
Output: true
Explanation: The given linked list is 1 -> 2 -> 1 -> 1 -> 2 -> 1, which is a palindrome.
Input:
   
Output: false
Explanation: The given linked list is 10 -> 20 -> 30 -> 40 -> 50, which is not a palindrome.
Constraints:
1 ≤ number of nodes ≤ 105
0 ≤ node->data ≤ 103 */
public class Pro_31{
    public static void main(String[] args) {
    }
    public boolean isPalindrome(Node head1) {
        // Naive approach
        // code here
        // ArrayList<Integer> ans = new ArrayList<>();
        // Node temp = head;
        // while(temp != null){
        //     ans.add(temp.data);
        //     temp = temp.next;
        // }
        // int i = 0;
        // int j = ans.size()-1;
        // while(i < j){
        //     if(!ans.get(i++).equals(ans.get(j--))) return false;
        // }
        // return true;
        // Better approach
        if(head1 == null || head1.next == null) return true;
        Node slow = head1;
        Node fast = head1;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        slow.next = null;
        Node p = head2;
        Node c = head2;
        Node f = head2.next;
        c.next = null;
        while(f != null){
            c = f;
            f = f.next;
            c.next = p;
            p = c;
        }
        while(c != null && head1 != null){
            if(c.val != head1.val) return false;
            c = c.next;
            head1 = head1.next;
        }
        return true;
    }
}