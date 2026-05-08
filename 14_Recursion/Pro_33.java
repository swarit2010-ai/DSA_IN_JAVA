import java.util.*;
/*Given a number n. Find its unique prime factors in increasing order.


Examples :

Input: n = 100
Output: [2, 5]
Explanation: Unique prime factors of 100 are 2 and 5.
Input: n = 60
Output: [2, 3, 5]
Explanation: Prime factors of 60 are 2, 2, 3, 5. Unique prime factors are 2, 3 and 5.
Constraints:
1 ≤ n ≤ 106 */
public class Pro_33{
    public static void main(String[] args) {
    }
    public static ArrayList<Integer> primeFac(int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        prime(n,ans,1,0);
        return ans;
        // int i = 2;
        // int flag = 0;
        // while(n > 1){
        //     if(n % i == 0){
        //         if(flag!=i){
        //             ans.add(i);
        //         }
        //         n/=i;
        //         flag = i;
        //     }
        //     else i++;
        // }
        // return ans;
    }
    public static void prime(int n,ArrayList<Integer> ans,int i,int flag){
        if(n <= 1) return;
        if(n % i == 0){
            if(flag!=i){
                ans.add(i);
            }
            n/=i;
            flag = i;
            prime(n,ans,i,flag);
        }
        else prime(n,ans,i+1,flag);
    }
}