/*Given two positive integers a and b, find GCD of a and b.

Note: Don't use the inbuilt gcd function

Examples:

Input: a = 20, b = 28
Output: 4
Explanation: GCD of 20 and 28 is 4
Input: a = 60, b = 36
Output: 12
Explanation: GCD of 60 and 36 is 12
Constraints:
1 ≤ a, b ≤ 109 */
public class Pro_12{
    public static void main(String[] args) {
    }
    public static int gcd(int a, int b) {
        // code here
        // Normal method :
        // int gcd = 1;
        // for(int i = 2;i <= Math.min(a,b);i++){
        //     if(a % i == 0 && b % i == 0) gcd = i;
        // }
        // return gcd;
        // Logarithmic method : (God method) : T.C = O(log(min(a,b)))
        return hcf(Math.min(a,b),Math.max(a,b));
    }
    public static int hcf(int a,int b){
        if(b%a == 0) return a;
        return hcf(b%a,a);
    }
}