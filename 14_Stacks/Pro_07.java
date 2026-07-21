/*2487. Remove Nodes From Linked List
Medium
Topics
premium lock icon
Companies
Hint
You are given the head of a linked list.

Remove every node which has a node with a greater value anywhere to the right side of it.

Return the head of the modified linked list.

 

Example 1:


Input: head = [5,2,13,3,8]
Output: [13,8]
Explanation: The nodes that should be removed are 5, 2 and 3.
- Node 13 is to the right of node 5.
- Node 13 is to the right of node 2.
- Node 8 is to the right of node 3.
Example 2:

Input: head = [1,1,1,1]
Output: [1,1,1,1]
Explanation: Every node has value 1, so no nodes are removed.
 

Constraints:

The number of the nodes in the given list is in the range [1, 105].
1 <= Node.val <= 105 */

import java.util.Stack;

public class Pro_07{
    public static void main(String[] args) {
    }
    public Node removeNodes(Node head) {
        Stack<Node> st = new Stack<>();
        Node temp = head;
        while (temp != null) {
            while (!st.isEmpty() && st.peek().val < temp.val) {
                st.pop();
            }
            st.push(temp);
            temp = temp.next;
        }
        if(st.isEmpty()) return null;
        Node ans = new Node(st.pop().val);
        while(!st.isEmpty()){
            Node new_node = st.pop();
            new_node.next = ans;
            ans = new_node;
        }
        return ans;
    }
}