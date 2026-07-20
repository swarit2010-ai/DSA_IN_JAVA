/*Given a number n, find the value of n raised to the power of its own reverse.
Note: The result will always fit into a 32-bit signed integer.

Examples:

Input: n = 2
Output: 4
Explanation: The reverse of 2 is 2, and 22 = 4.
Input: n = 10
Output: 10
Explanation: The reverse of 10 is 1 (leading zero is discarded), and 10 raised to the power 1 is 10.
Constraints:
1 ≤ n ≤ 10 */
public class Pro_07{
    public static void main(String[] args) {
    }
    public int reverseExponentiation(int n) {
        // code here
        return expo(n,reverse(n,0));
    }
    public static int expo(int a,int b){
        if(b == 0) return 1;
        int ans = (expo(a, b/2));
        if(b % 2 == 0) return ans*ans;
        else return a*(expo(a,b-1));
    }
    public static int reverse(int n,int rev) {
        if(n == 0) return rev;
        rev = rev*10+n%10;
        return reverse(n/10,rev);
    }
}