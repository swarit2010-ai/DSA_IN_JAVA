/*Given a matrix mat[][] of size n x n. Print the elements of the matrix in the snake like pattern depicted below.


Examples :

Input: n = 3, mat[][] = [[45, 48, 54], [21, 89, 87], [70, 78, 15]]
Output: [45, 48, 54, 87, 89, 21, 70, 78, 15] 
Explanation: Printing it in snake pattern will lead to the output as [45, 48, 54, 87, 89, 21, 70, 78, 15] 
.
Input: n = 2, mat[][] = [[1, 2], [3, 4]]
Output: [1, 2, 4, 3] 
Explanation: Printing it in snake pattern will give output as [1, 2, 4, 3]..
Constraints:
1 <= n <= 103
1 <= mat[i][j] <= 109 */
import java.util.*;
public class Pro_05{
    public static void main(String[] args) {
    }
    static ArrayList<Integer> snakePattern(int arr[][]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0;i < arr.length;i++){
            for(int j = 0,k = arr[0].length-1;j < arr[0].length && k >= 0;j++,k--){
                if(i % 2 == 0) ans.add(arr[i][k]);
                else ans.add(arr[i][j]);
            }
        }
        return ans;
    }
}