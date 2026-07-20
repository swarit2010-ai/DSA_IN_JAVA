import java.util.*;
/*Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




Example 1:

Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
Example 2:

Input: numRows = 1
Output: [[1]] */
public class Pro_12{
    public static void main(String[] args) {
    }
    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < n;i++){
            ans.add(new ArrayList<>());
            for(int j = 0;j <= i;j++){
                ans.get(i).add(1);
            }
        }
        for(int i = 2;i < ans.size();i++){
            for(int j = 1;j < ans.get(i).size()-1;j++){
                ans.get(i).set(j,ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
        }
        return ans;
    }
}