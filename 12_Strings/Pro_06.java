/* Given a string s, the task is to change the complete string to uppercase or lowercase depending on the case of the first character.

Examples:

Input: s = "abCD"
Output: "abcd"
Explanation: The first letter (a) is lowercase. Hence, the complete string is made lowercase.
Input: s = "Abcd"
Output: "ABCD"
Explanation: The first letter (A) is uppercase. Hence, the complete string is made uppercase.
Constraints:
1<=|s|<=104*/
/* */
public class Pro_06{
    public static void main(String[] args) {
    }
    String modify(String s) {
        if(s.length() != 0) {
            if((int)s.charAt(0) <= 90) return s.toUpperCase();
            else return s.toLowerCase();
        }
        return "";
    }
}