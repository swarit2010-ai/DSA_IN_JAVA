public class Pro_13 {
    public static void main(String[] args) {
        for(int i = 1;i <= 5;i++){
            for(int j = i;j <= 4;j++){
                System.out.print(" ");
            }
            for(int m = 1;m <= i;m++){
                System.out.print(m);
            }
            for(int n = i-1;n > 0;n--){
                System.out.print(n);
            }
            System.out.println();
        }
    }
}
