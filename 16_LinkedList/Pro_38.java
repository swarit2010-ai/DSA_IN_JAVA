/* Reverse a sublist of a linked list
Difficulty: HardAccuracy: 62.68%Submissions: 21K+Points: 8
Given a singly linked list and two positions a and b, reverse the nodes of the linked list from position a to b (1-indexed) and return the head of the modified linked list. The reversal must be done in-place without using extra space for another list.

Examples:

Input: a = 2, b = 4, head = 1->3->5->4->9->8->10->NULL
 
Output:

Explanation: Nodes from position 3 to 4 are reversed resulting in 1 4 5 3 9 8 10.
Input: a = 1, b = 8, head = 1->7->5->3->9->8->10->2->2->5->NULL

Output: 

Explanation: The nodes from position 1 to 8 are reversed, resulting in 2 10 8 9 3 5 7 1 2 5.
Constraints:
1 ≤ size of linked list ≤ 10^5
1 ≤ a ≤ b ≤ size of linked list
1 ≤ data of nodes ≤ 109
*/

import java.util.ArrayList;

public class Pro_38{
    public static void main(String[] args) {
    }
    Node reverseBetween(int a, int b, Node head) {
        // code here
        ArrayList<Node> list = new ArrayList<>();
        Node temp = head;
        while(temp != null){
            list.add(temp);
            temp = temp.next;    
        }
        reverse(a-1,b-1,list);
        Node ans = new Node(-1);
        temp = ans;
        for(int i = 0;i < list.size();i++){
            temp.next = list.get(i);
            temp = temp.next;
        }
        temp.next = null;
        return ans.next;
    }
    void reverse(int i,int j,ArrayList<Node> list){
        while(i < j){
            Node temp = list.get(i);
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }
}