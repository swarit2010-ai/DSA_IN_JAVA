/*Reverse a Stack
Difficulty: MediumAccuracy: 80.5%Submissions: 136K+Points: 4Average Time: 20m
You are given a stack st[]. You have to reverse the stack.

Note: The input array represents the stack from bottom to top (last element is the top). The output is displayed by printing elements from top to bottom after reversal.

Examples:

Input: st[] = [1, 2, 3, 4]
Output: [1, 2, 3, 4]
Explanation: After reversing, the elements of stack are in opposite order.

Input: st[] = [3, 2, 1]
Output: [3, 2, 1]
Explanation: After reversing, the elements of stack are in opposite order.

Constraints:
1 ≤ st.size() ≤ 100
0 ≤ stack element ≤ 100 */

import java.util.Stack;

public class Pro_02{
    public static void main(String[] args) {
    }
    public static void reverseStack(Stack<Integer> st) {
        // code here
        // Two extra stack method:
        // Stack<Integer> st2 = new Stack<>();
        // while(st.size() > 0) st2.push(st.pop());
        // Stack<Integer> st3 = new Stack<>();
        // while(st2.size() > 0) st3.push(st2.pop());
        // while(st3.size() > 0) st.push(st3.pop());
        // Array method
        // int[] arr = new int[st.size()];
        // int idx = 0;
        // while(st.size() > 0){
        //     arr[idx] = st.pop();
        //     idx++;
        // }
        // for(int i = 0;i < arr.length;i++) st.push(arr[i]);
        // Recursive call stack method
        if(st.size() == 0) return;
        int top = st.pop();
        reverseStack(st);
        insertAtBottom(st,top);
    }
    public static void insertAtBottom(Stack<Integer> st, int x) {
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st,x);
        st.push(top);
    }
}