/* You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.



Example 1:


Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.
Example 2:


Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.


Constraints:

1 <= n <= 231 - 1
Leetcode 441
*/
public class Pro_10{
    public static void main(String[] args) {
    }
    // public int arrangeCoins(int n) {
    //     long m = n;
    //     long k = (sqrt(8*m+1) -1)/2;
    //     return (int)k;
    // }
    // public long sqrt(long x) {
    //     long low = 0,high = x,mid;
    //     if(x == 0 || x == 1) return x;
    //     while(low <= high){
    //         mid = low + (high-low)/2;
    //         if(mid == x/mid) return mid;
    //         else if(mid  > x/mid) high = mid-1;
    //         else low = mid+1;
    //     }
    //     return high;
    // }
    public int arrangeCoins(int n) {
        long low = 0,high = n,ans = 0;
        while(low <= high){
            long mid = low + (high-low)/2;
            long k = mid*(mid+1)/2;
            if(k == n) return (int)mid;
            else if(k > n) high = mid-1;
            else{
                ans = mid;
                low = mid+1;
            }
        }
        return (int)ans;
    }
}