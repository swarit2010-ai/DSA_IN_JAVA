/* Given two integers n and m. You have to find the smallest modular multiplicative inverse of n under modulo m. if it does not exist then return -1.

Examples :

Input: n = 3, m = 11
Output: 4
Explanation: Since (4 × 3) mod 11 = 1, 4 is the modulo inverse of 3 under mod 11.
Input: n = 10, m = 17
Output: 12
Explanation: Since (12*10) mod 17 = 1, 12 is the modulo inverse of 10.
Constraints:
1 ≤ n ≤ 104
1 ≤ m ≤ 105*/
public class Pro_34{
    public static void main(String[] args) {
    }
    public int modInverse(int n, int m) {
        // code here
        return helper(n,m,1);
    }
    public int helper(int n,int m,int i){
        if(i > m) return -1;
        if(n*i % m == 1) return i;
        return helper(n,m,i+1);
    }
}