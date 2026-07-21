/* Parenthesis Checker
Difficulty: EasyAccuracy: 28.56%Submissions: 747K+Points: 2
Given a string s, composed of different combinations of '(' , ')', '{', '}', '[', ']'. Determine whether the Expression is balanced or not.
An expression is balanced if:

Each opening bracket has a corresponding closing bracket of the same type.
Opening brackets must be closed in the correct order.
Examples :

Input: s = "[{()}]"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "[()()]{}"
Output: true
Explanation: All the brackets are well-formed.
Input: s = "([]"
Output: false
Explanation: The expression is not balanced as there is a missing ')' at the end.
Input: s = "([{]})"
Output: false
Explanation: The expression is not balanced as there is a closing ']' before the closing '}'.
Constraints:
1 ≤ s.size() ≤ 106
s[i] ∈ {'{', '}', '(', ')', '[', ']'}*/

import java.util.Stack;

public class Pro_03 {
    public static void main(String[] args) {
    }
    public boolean isBalanced(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        if(s.length() % 2 == 1) return false;
        for(int idx = 0;idx < s.length();idx++){
            char ch = s.charAt(idx);
            if(ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                char top = st.peek();
                if(ch == ')' && top == '(') st.pop();
                else if(ch == '}' && top == '{') st.pop();
                else if(ch == ']' && top == '[') st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
