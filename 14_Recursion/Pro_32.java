import java.util.*;
/* Given an integer n, return all the divisors of n in the ascending order.

Examples:

Input : n = 20
Output: 1 2 4 5 10 20
Explanation: 20 is completely divisible by 1, 2, 4, 5, 10 and 20.
Input: n = 21191
Output: 1 21191
Explanation: As 21191 is a prime number, it has only 2 factors(1 and the number itself).
Constraints:
1 ≤ n ≤ 109*/
public class Pro_32{
    public static void main(String[] args) {
    }
    public ArrayList<Integer> getDivisors(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        divi(n,ans,1);
        Collections.sort(ans);
        return ans;
    }
    public void divi(int n,ArrayList<Integer> ans,int i){
        if(i*i > n) return;
        if(n % i == 0){
            if(i == n/i) ans.add(i);
            else {
                ans.add(i);
                ans.add(n/i);
            }
        }
        divi(n,ans,i+1);
    }
}