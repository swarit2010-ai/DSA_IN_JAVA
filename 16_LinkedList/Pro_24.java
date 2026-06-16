/*Segregate Evens and Odds in a Linked List
Difficulty: MediumAccuracy: 49.8%Submissions: 102K+Points: 4Average Time: 10m
Given a link list, modify the list such that all the even numbers appear before all the odd numbers in the modified list. The order of appearance of numbers within each segregation should be the same as that in the original list.

NOTE: Don't create a new linked list, instead rearrange the provided one.

Examples:

Input: Linked list: 17->15->8->9->2->4->6
Output: 8->2->4->6->17->15->9

Explaination: 8,2,4,6 are the even numbers so they appear first and 17,15,9 are odd numbers that appear later.
Input: Linked List: 1 -> 3 -> 5 -> 7
Output: 1->3->5->7

Explaination: There is no even number. So no need for modification.
Constraints:
1 ≤ size of linked list ≤ 105
1 ≤ Each element of the list ≤ 105 */
public class Pro_24{
    public static void main(String[] args) {
    }
    Node divide(Node head) {
        // code here
        Node even = new Node(-1);
        Node odd = new Node(-1);
        Node t1 = even;
        Node t2 = odd;
        Node temp = head;
        while(temp != null){
            if(temp.val % 2 == 0){
                t1.next = temp;
                t1 = t1.next;
            }
            else{
                t2.next = temp;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        t1.next = odd.next;
        t2.next = null;
        return even.next;
    }
}