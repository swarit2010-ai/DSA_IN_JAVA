/*For an integer n, find the number of trailing zeroes in n!.

Examples :

Input: n = 5
Output: 1
Explanation: 5! = 120 so the number of trailing zero is 1.
Input: n = 4
Output: 0
Explanation: 4! = 24 so the number of trailing zero is 0.
Constraints:
1 <= n <= 109 */
public class Pro_30{
    public static void main(String[] args) {
    }
    static int trailingZeroes(int n) {
        // code here
        if(n < 5) return 0;
        return n/5+trailingZeroes(n/5);
    }
}