/*Given a number n, determine whether it is a prime number or not.
Note: A prime number is a number greater than 1 that has no positive divisors other than 1 and itself.

Examples :

Input: n = 7
Output: true
Explanation: 7 has exactly two divisors: 1 and 7, making it a prime number.
Input: n = 25
Output: false
Explanation: 25 has more than two divisors: 1, 5, and 25, so it is not a prime number.
Input: n = 1
Output: false
Explanation: 1 has only one divisor (1 itself), which is not sufficient for it to be considered prime.
Constraints:
1 ≤ n ≤ 109 */
public class Pro_31{
    public static void main(String[] args) {
    }
    static boolean isPrime(int n) {
        // Nice method :
        // if(n == 1) return false;
        // if(n == 2 || n == 3) return true;
        // if(n % 2 == 0 || n % 3 == 0) return false;
        // for(int i = 2;i*i <= n;i++) {if(n % i == 0) return false;}
        // return true;
        
        // Normal method :
        // int c = 0;
        // for(int i = 1;i <= n;i++){
        //     if(n % i == 0) c++;
        //     if(c > 2) break;
        // }
        // if(c == 2) return true;
        // return false;
        
        // Recursive method :
        if(n == 2 || n == 3) return true;
        if(n % 2 == 0 || n % 3 == 0 || n == 1) return false;
        return prime(n,2);
    }
    static boolean prime(int n,int i){
        if(i*i > n) return true;
        if(n % i == 0) return false;
        return prime(n,i+1);
    }
}