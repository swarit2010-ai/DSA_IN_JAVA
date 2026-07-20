import java.util.*;
/*Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:


 

Example 1:

Input: rowIndex = 3
Output: [1,3,3,1]
Example 2:

Input: rowIndex = 0
Output: [1]
Example 3:

Input: rowIndex = 1
Output: [1,1]
 

Constraints:

0 <= rowIndex <= 33 */
public class Pro_13{
    public static void main(String[] args) {
    }
    public List<Integer> getRow(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i < n+1;i++){
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
        return ans.get(n);
    }
}