/*You are given two positive integers a and b Your task is to compute and return the Least Common Multiple (LCM) of the two numbers.
The LCM of two integers is the smallest positive integer that is divisible by both a and b.

Examples:

Input: a = 12, b = 18
Output: 36
Explanation: LCM of 12 and 18 is 36
Input: a = 5, b = 11
Output: 55
Explanation: LCM of 5 and 11 is 55
Constraints:
1 ≤ a, b ≤ 104 */
// lcm(a,b) = a*b/gcd(a,b)
public class Pro_14{
    public static void main(String[] args) {
    }
    public int lcm(int a, int b) {
        // code here
        return a*b/hcf(a, b);
    }
    public static int hcf(int a,int b){
        if(b%a == 0) return a;
        return hcf(b%a,a);
    }
}