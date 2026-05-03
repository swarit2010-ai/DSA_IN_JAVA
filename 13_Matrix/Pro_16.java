import java.util.*;
/*You are given two square matrices mat1[][] and mat2[][], each of size n × n. You have to multiply these two matrices and return the resulting matrix.

Examples:

Input: mat1[][] = [[1, 1, 1], mat2[][] = [[1, 1, 1],
                [1, 1, 1],             [1, 1, 1],
                [1, 1, 1]]             [1, 1, 1]]
Output: [[3, 3, 3],
        [3, 3, 3],
        [3, 3, 3]]
Explanation: After multiplying mat1 and mat2 we get the resulting matrix equal to [[3, 3, 3], [3, 3, 3], [3, 3, 3]].
Input: mat1[][] = [[1, 2], mat2[][] = [[4, 3],
                [3, 4]]             [2, 1]]
Output: [[8, 5],
    [20, 13]]
Explanation: After multiplying mat1 and mat2 we get the resulting matrix equal to [[8, 5], [20, 13]]
Constraints:
1 ≤ n ≤ 100
1 ≤ mat1[i][j], mat2[i][j] ≤ 100 */
public class Pro_16{
    public static void main(String[] args) {
    }
    public ArrayList<ArrayList<Integer>> multiply(int[][] mat1, int[][] mat2) {
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int sum = 0;
        for(int i = 0;i < mat1.length;i++){
            ans.add(new ArrayList<>());
            for(int j = 0;j < mat1.length;j++){
                for(int k = 0;k < mat1.length;k++){
                    int p = mat1[i][k] * mat2[k][j];
                    sum += p;
                }
                ans.get(i).add(sum);
                sum = 0;
            }
        }
        return ans;
    }
}