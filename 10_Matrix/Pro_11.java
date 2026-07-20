/*Given a square mat[][]. The task is to rotate it by 90 degrees in clockwise direction without using any extra space.

Examples:

Input: mat[][] = [[1 2 3], [4 5 6], [7 8 9]]
Output:
7 4 1 
8 5 2
9 6 3
Input: mat[][] = [1 2], [3 4]
Output:
3 1 
4 2
Input: mat[][] = [[1]]
Output:
1
Constraints:
1 ≤ mat.size() ≤ 1000
1 <= mat[][] <= 100 */
public class Pro_11{
    public static void main(String[] args) {
    }
    static void rotate(int mat[][]) {
        // Code Here
        for(int i = 0;i < mat.length;i++){
            for(int j = i;j < mat[0].length;j++){
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        for(int[] arr:mat){
            int i = 0;
            int j = arr.length-1;
            while(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}