public class Pro_13 {

    public static void main(String[] args) {
        double f = 1;
        double div;
        for(int n = 1;n <= 15;n++){
            for(int m = 1;m <= n;m++){
                f *= m;
            }
            div = n/f;
            System.out.println(div);       
            f = 1;
        }
    }
}