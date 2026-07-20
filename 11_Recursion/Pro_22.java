import java.util.*;
/* Given a string s of length n, find all the possible non-empty subsequences of the string s in lexicographically-sorted order.

Example 1:

Input : 
s = "abc"
Output: 
a ab abc ac b bc c
Explanation : 
There are a total 7 number of subsequences possible for the given string, and they are mentioned above in lexicographically sorted order.
Example 2:

Input: 
s = "aa"
Output: 
a a aa
Explanation : 
There are a total 3 number of subsequences possible for the given string, and they are mentioned above in lexicographically sorted order.
Your Task:
You don't need to read input or print anything. Your task is to complete the function AllPossibleStrings() which takes a string s as the input parameter and returns a list of all possible subsequences (non-empty) that can be formed from s in lexicographically sorted order.

Expected Time Complexity: O( n*2n  )
Expected Space Complexity: O( n * 2n )

Constraints: 
1 <= n <= 16
s constitutes of lower case english alphabets*/
public class Pro_22{
    public static void main(String[] args) {
    }
    public List<String> AllPossibleStrings(String s) {
        List<String> ans = new ArrayList<>();
        subset(s,0,ans,"");
        ans.remove(ans.size()-1);
        Collections.sort(ans);
        return ans;
    }
    public void subset(String s,int i,List<String> ans,String s1){
        if(i == s.length()){
            ans.add(s1);
            return;
        }
        char ch = s.charAt(i);
        subset(s,i+1,ans,s1+ch);
        subset(s,i+1,ans,s1);
    }
}