/*You are given a number n. You need to find the sum of digits of n.

Examples :

Input: n = 1
Output: 1
Explanation: Sum of digit of 1 is 1.
Input: n = 99999
Output: 45
Explanation: Sum of digit of 99999 is 45.
Constraints:
1 ≤ n ≤ 107 */
public class Pro_08{
    public static void main(String[] args) {
    }
    public static int sumOfDigits(int n) {
        // Code here
        return sum(n,0);
    }
    public static int sum(int n,int s){
        if(n == 0) return s;
        s += n%10;
        return sum(n/10,s);
    }
}