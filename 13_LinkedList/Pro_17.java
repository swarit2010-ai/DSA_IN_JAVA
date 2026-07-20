/*Rotate a Linked List
Difficulty: MediumAccuracy: 39.95%Submissions: 320K+Points: 4Average Time: 30m
You are given the head of a singly linked list, you have to left rotate the linked list k times. Return the head of the modified linked list.

Examples:

Input: k = 4,
   
Output: 50 -> 10 -> 20 -> 30 -> 40
Explanation:
Rotate 1: 20 -> 30 -> 40 -> 50 -> 10
Rotate 2: 30 -> 40 -> 50 -> 10 -> 20
Rotate 3: 40 -> 50 -> 10 -> 20 -> 30
Rotate 4: 50 -> 10 -> 20 -> 30 -> 40
   
Input: k = 6,
   
Output: 30 -> 40 -> 10 -> 20 
   
Constraints:
1 ≤ number of nodes ≤ 105
0 ≤ k ≤ 109
0 ≤ node.data ≤ 109 */
public class Pro_17{
    public static void main(String[] args) {
    }
    public Node rotate(Node head, int k) {
        int size = 0;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        if(k % size == 0) return head;
        k = k % size;
        temp = head;
        Node temp2 = head;
        int i = 1;
        while(temp.next != null){
            temp = temp.next;
            if(i == k-1) temp2 = temp;
            i++;
        }
        Node ans = temp2.next;
        temp.next = head;
        temp2.next = null;
        return ans;
    }
}