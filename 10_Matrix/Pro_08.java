// WAP to snake print a matrix column wise
public class Pro_08{
    public static void main(String[] args) {
        int[][] mat = {{1,4,5},{5,4,7},{8,9,8}};
        for(int j = 0;j < mat[0].length;j++){
            for(int i = 0,k = mat.length-1;i < mat.length && k >= 0;i++,k--){
                if(j % 2 == 1) System.out.print(mat[k][j]);
                else System.out.print(mat[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}