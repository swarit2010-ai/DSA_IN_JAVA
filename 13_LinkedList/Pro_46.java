/*Split a Linked List into two halves
Difficulty: EasyAccuracy: 61.63%Submissions: 67K+Points: 2
Given a Circular linked list. The task is split into two Circular Linked lists. If there are an odd number of nodes in the given circular linked list then out of the resulting two halved lists, the first list should have one node more than the second list.

Examples :

Input: LinkedList : 10->4->9
Output: 10->4 , 9

Explanation: After dividing linked list into 2 parts , the first part contains 10, 4 and second part contain only 9.
Input: LinkedList : 10->4->9->10
Output: 10->4 , 9->10

Explanation: After dividing linked list into 2 parts , the first part contains 10, 4 and second part contain 9, 10.
Constraints:
2 <= number of nodes <= 105
1 <= node->data <= 103 */
class Pair<K, V> {
    private final K first;
    private final V second;
    public Pair(K first, V second) {
        this.first = first;
        this.second = second;
    }
    public K getFirst() { return first; }
    public V getSecond() { return second; }
}
public class Pro_46{
    public static void main(String[] args) {
    }
    public Pair<Node, Node> splitList(Node head) {
        // Code here
        Node temp = head;
        while(temp.next != head){
            temp = temp.next;
        }
        temp.next = null;
        Node slow = head;
        Node fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node head2 = slow.next;
        temp.next = head2;
        slow.next = head;
        return new Pair<>(head,head2);
    }
}