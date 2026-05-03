public class Pro_12 {

    public static void main(String[] args) {
        int f = 1;
        for(int n = 1;n <= 10;n++){
            for(int m = 1;m <= n;m++){
                f *= m;
            }
            System.out.println(f);
            f = 1;
        }
    }
}