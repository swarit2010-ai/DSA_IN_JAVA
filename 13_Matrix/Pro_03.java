// WAP to print the maximum of all rows in matrix
public class Pro_03{
    public static void main(String[] args) {
        int max_sum = Integer.MIN_VALUE;
        int sum = 0;
        int row = 0;
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                sum += arr[i][j];
            }
            if(sum > max_sum) {
                max_sum = sum;
                row = i+1;
            }
            sum = 0;
        }
        System.out.println("The max is " + max_sum + " and the row is " + row);
    }
}