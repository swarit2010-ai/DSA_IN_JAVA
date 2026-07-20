import java.util.*;
/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

 

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]
Example 2:

Input: n = 1
Output: ["()"]
 

Constraints:

1 <= n <= 8 */
public class Pro_25{
    public static void main(String[] args) {
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        generate(ans,n,0,0,"");
        return ans;
    }
    public void generate(List<String> ans,int n,int l,int r,String s){
        if(r == n){
            ans.add(s);
            return;
        }
        if(l < n){
            generate(ans,n,l+1,r,s+'(');
        }
        if(r < l){
            generate(ans,n,l,r+1,s+')');
        }
    }
}