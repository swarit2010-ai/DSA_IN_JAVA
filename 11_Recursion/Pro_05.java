/*You are given an integer n. Your task is to reverse the digits, ensuring that the reversed number has no leading zeroes.

Examples:

Input: n = 122
Output: 221
Explanation: By reversing the digits of number, number will change into 221.
Input : n = 200
Output: 2
Explanation: By reversing the digits of number, number will change into 2.
Input : n = 12345 
Output: 54321
Explanation: By reversing the digits of number, number will change into 54321.
Constraints:
1 <= n <= 106 */
public class Pro_05{
    public static void main(String[] args) {
    }
    public int reverseDigits(int n) {
        // Code here
        return reverse(n,0);
    }
    public static int reverse(int n,int rev) {
        if(n == 0) return rev;
        rev = rev*10+n%10;
        return reverse(n/10,rev);
    }
} 