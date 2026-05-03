/*Given a string s consisting of lowercase English Letters. return the first non-repeating character in s. If there is no non-repeating character, return '$'.

Examples:

Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
Input: s = "racecar"
Output: 'e'
Explanation: In the given string, 'e' is the only character in the string which does not repeat.
Input: s = "aabbccc"
Output: '$'
Explanation: All the characters in the given string are repeating.
Constraints:
1 ≤ s.size() ≤ 105 */
public class Pro_12{
    public static void main(String[] args) {
    }
    public char nonRepeatingChar(String s) {
        if(s.length() == 1) return s.charAt(0);
        boolean check = true;
        for(int i = 0;i < s.length()-1;i++){
            for(int j = i+1;j < s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    check = false;
                    break;
                }
            }
            for(int j = i-1;j >= 0;j--){
                if(s.charAt(i) == s.charAt(j)){
                    check = false;
                    break;
                }
            }
            if(check) return s.charAt(i);
            check = true;
        }
        return '$';
    }
}