// WAP to find the max element of a 2d array
public class Pro_02{
    public static void main(String[] args) {
        int[][] arr = {{1,2,5},{1,5,6}};
        int max = Integer.MIN_VALUE;
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                if(arr[i][j] > max) max = arr[i][j];
            }
        }
        System.out.println(max);
    }
}