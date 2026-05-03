// WAP to reverse all columns of a matrix
public class Pro_09{
    public static void main(String[] args) {
        int[][] mat = {{1,4,5},{5,4,7},{8,9,8}};
        for(int j = 0;j < mat[0].length;j++){
            for(int i = 0,k = mat.length-1;i < k;i++,k--){
                int temp = mat[i][j];
                mat[i][j] = mat[k][j];
                mat[k][j] = temp;
            }
        }
    }
}