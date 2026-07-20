// WAP to reverse all the rows of a 2d array  
public class Pro_07{
    public static void main(String[] args) {
        int[][] mat = {{1,4,5},{5,4,7},{8,9,8}};
        for(int k = 0;k < mat.length;k++){
            int i = 0;
            int j = mat[0].length-1;
            while(i < j){
                int temp = mat[k][j];
                mat[k][j] = mat[k][i];
                mat[k][i] = temp;
                i++;
                j--;
            }
        }
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}