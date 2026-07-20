/*Partition a Linked List around a given value
Difficulty: MediumAccuracy: 52.41%Submissions: 20K+Points: 4
Given the head of a linked list and an integer x, rearrange the list such that:
All nodes with values less than x appear first,
Followed by nodes with values equal to x,
Followed by nodes with values greater than x.
The relative order of nodes within each partition must remain unchanged, and the rearrangement should be performed in-place.
 
Examples:
Input: head: 1->4->2->10, x = 3
 
Output: 1->2->4->10

Explanation: Nodes with value less than 3 come first, then equal to 3 and then greater than 3.
Input: head: 1->4->3->2->5->2->3, x = 3
 
Output: 1->2->2->3->3->4->5
 
Explanation: Nodes with a value less than 3 come first, then equal to 3 and then greater than 3.
Constraints:
1 ≤ size of linked list ≤ 105
1 ≤ data of node ≤ 105
1 ≤ x ≤ 105 */
public class Pro_23{
    public static void main(String[] args) {
    }
    public Node partition(Node head, int x) {
        // code here
        Node d1 = new Node(-1);
        Node d2 = new Node(-1);
        Node d3 = new Node(-1);
        Node t1 = d1;
        Node t2 = d2;
        Node t3 = d3;
        Node temp = head;
        while(temp != null){
            if(temp.val < x){
                t1.next = temp;
                t1 = t1.next;
            }
            else if(temp.val == x){
                t2.next = temp;
                t2 = t2.next;
            }
            else{
                t3.next = temp;
                t3 = t3.next;
            }
            temp = temp.next;
        }
        t1.next = d2.next;
        t2.next = d3.next;
        t3.next = null;
        return d1.next;
    }
}