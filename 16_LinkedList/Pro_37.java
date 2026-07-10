/*Merge K sorted linked lists
Difficulty: MediumAccuracy: 57.01%Submissions: 128K+Points: 4Average Time: 60m
Given an array arr[] of n sorted linked lists of different sizes. Your task is to merge all these lists into a single sorted linked list and return the head of the merged list.

Examples:

Input:
   
Output: 1 -> 2 -> 3 -> 4 -> 7 -> 8 -> 9
Explanation: The arr[] has 3 sorted linked list of size 3, 3, 1.
1st list: 1 -> 3 -> 7
2nd list: 2 -> 4 -> 8
3rd list: 9
The merged list will be: 
    
Input:
   
Output: 1 -> 3 -> 4 -> 5 -> 6 -> 8
Explanation: The arr[] has 3 sorted linked list of size 2, 1, 3.
1st list: 1 -> 3
2nd list: 8
3rd list: 4 -> 5 -> 6
The merged list will be: 
    
Constraints
1 ≤ total no. of nodes ≤ 105
1 ≤ node->data ≤ 103 */

import java.util.ArrayList;
import java.util.Arrays;

public class Pro_37{
    public static void main(String[] args) {
    }
    Node mergeKLists(Node[] array) {
        // easiest approach
        // code here
        ArrayList<Node> arr = new ArrayList<>(Arrays.asList(array));
        while(arr.size()!=1){
            Node a = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            Node b = arr.get(arr.size()-1);
            arr.remove(arr.size()-1);
            Node c = merge(a,b);
            arr.add(c);
        }
        return arr.get(0);
    }
    Node merge(Node h1, Node h2) {
        // code here
        Node t1 = h1;
        Node t2 = h2;
        Node h = new Node(-1);
        Node t = h;
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                t.next = t1;
                t1 = t1.next; 
            }
            else{
                t.next = t2;
                t2 = t2.next;  
            }
            t = t.next;
        }
        if(t1 == null) t.next = t2;
        else t.next = t1;
        return h.next;
    }
}
