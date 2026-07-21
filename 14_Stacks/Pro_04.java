/*Replace Consecutive Two Same with One
Solved
Difficulty: EasyAccuracy: 53.35%Submissions: 116K+Points: 2
Given a string s, consisting of lowercase alphabets. Remove consecutive duplicate characters from the string. 

Example:

Input: s = "aabb"
Output: "ab" 
Explanation: The character 'a' at index 2 is the same as 'a' at index 1, so it is removed.Similarly, the character 'b' at index 4 is the same as 'b' at index 3, so it is removed. The final string is "ab".
Input: s = "aabaa"
Output: "aba"
Explanation: The character 'a' at index 2 is the same as 'a' at index 1, so it is removed. The character 'a' at index 5 is the same as 'a' at index 4, so it is removed. The final string is "aba".
Input: s = "aaaa"
Output: "a"
Explanation: "aaaa" => "aaa" => "aa" => "a" 
Constraints:
1 ≤ n ≤ 106
All characters in the string are lowercase English alphabets. */

import java.util.Stack;

public class Pro_04{
    public static void main(String[] args) {
    }
    public String removeDuplicates(String s) {
        // code here
        Stack<Character> st = new Stack<>();
        StringBuilder str = new StringBuilder();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(st.isEmpty()) {
                str.append(ch);
                st.push(ch);
            }
            else{
                if(ch != st.peek()){
                    st.push(ch);
                    str.append(ch);
                }
            }
        }
        return str.toString();
    }
}