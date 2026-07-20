/*Search in Linked List
Difficulty: EasyAccuracy: 65.4%Submissions: 163K+Points: 2Average Time: 10m
Given a linked list with the head node and a key, the task is to check if the key is present in the linked list or not. Return true if key is present, else return false.

Example:

Input: key = 3,
      
Output: true 
Explanation: 3 is present in Linked List.
Input: key = 4,
   
Output: false
Explanation: 4 is not present in Linked List.
Constraint:
1 ≤ Number of nodes ≤ 105
1 ≤ node.data, key ≤ 105 */
public class Pro_35{
    public static void main(String[] args) {
    }
    public boolean searchKey(Node head, int key) {
        // Code here
        Node temp = head;
        while(temp != null){
            if(temp.val == key) return true;
            temp = temp.next;
        }
        return false;
    }
}