/*Reverse a linked list
Difficulty: EasyAccuracy: 73.11%Submissions: 394K+Points: 2Average Time: 30m
You are given the head of a singly linked list. You need to reverse the linked list and return the head of the reversed list.

Examples:

Input:
      
Output: 4 -> 3 -> 2 -> 1
Explanation: After reversing the linkedList
      
Input: 
      
Output: 8 -> 9 -> 10 -> 7 -> 2
Explanation: After reversing the linked list
      
Input: 
      
Output: 8
Explanation:
       
Constraints:
1 ≤ number of nodes ≤ 105
1 ≤ node->data ≤ 105 */
public class Pro_30{
    public static void main(String[] args) {
    }
    Node reverseList(Node head) {
        // Naive approach
        // code here
        // Node temp = head;
        // ArrayList<Node> ans = new ArrayList<>();
        // while(temp != null){
        //     ans.add(temp);
        //     temp = temp.next;
        // }
        // int n = ans.size();
        // for(int i = n-1;i > 0;i--){
        //     ans.get(i).next = ans.get(i-1);
        // }
        // ans.get(0).next = null;
        // return ans.get(n-1);
        // Better approach
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
        // Recursive approach
        // if(head.next == null) return head;
        // Node a = head.next;
        // head.next = null;
        // Node b = reverseList(a);
        // a.next = head;
        // return b;
    }
}